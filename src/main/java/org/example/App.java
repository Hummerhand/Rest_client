package org.example;

import org.example.Configuration.MyConfig;
import org.example.Controller.Communication;
import org.example.Entity.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App
{
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);

        List<Product> allProducts = communication.getAllProducts();

        System.out.println(allProducts);

//        Product productById = communication.getProduct(1);
//
//        System.out.println(productById);

//          Product product = new Product("Mi11", "Very fast smartphone", 999.0, 0, 99.9,
//                  "Xiaomi", "Smartphones");
//          //product.setId(..);
//          communication.saveProduct(product);

//        communication.deleteProduct(5);

    }
}
