package org.example.Controller;


import org.example.Entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class Communication {

    @Autowired
    private RestTemplate restTemplate;
    private final String URL = "http://localhost:8080/api/products";

    public List<Product> getAllProducts() {

        ResponseEntity<List<Product>> responseEntity = restTemplate.exchange(URL, HttpMethod.GET, null,
                new ParameterizedTypeReference<List<Product>>() {});

        List<Product> allProducts = responseEntity.getBody();

        return allProducts;
    }

    public Product getProduct(int id) {

        Product product = restTemplate.getForObject(URL + "/" + id, Product.class);

        return product;
    }

    public void saveProduct(Product product) {

        int id = product.getId();

        if (id == 0) {
            ResponseEntity<String> responseEntity = restTemplate.postForEntity(URL, product, String.class);
            System.out.println("New product was added to Database");
            System.out.println(responseEntity.getBody());
        }
        else {
            restTemplate.put(URL, product);
            System.out.println("Product with ID " + id + " was updated");
        }

    }

    public void deleteProduct(int id) {

        restTemplate.delete(URL + "/" + id);
        System.out.println("Product with ID " + id + " was deleted from Database");

    }

}
