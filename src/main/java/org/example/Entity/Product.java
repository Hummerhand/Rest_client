package org.example.Entity;

public class Product {

    private int id;
    private String title;
    private String description;
    private double price;
    private double discountPercentage;
    private double rating;
    private String brand;
    private String category;

    //======================================================================

    public Product(String mi11, String veryFastSmartphone, double v, int i, double v1, String xiomi, String smartphones) {
    }

    public Product(int id, String title, String description, double price, double discountPercentage, double rating, int stock, String brand, String category) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.discountPercentage = discountPercentage;
        this.rating = rating;
        this.brand = brand;
        this.category = category;
    }

    //=======================================================================

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    //=======================================================================

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", discountPercentage=" + discountPercentage +
                ", rating=" + rating +
                ", brand='" + brand + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
