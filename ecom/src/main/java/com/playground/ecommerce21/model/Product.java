// The Product class holds all the products that are available for sale. They are viewable by customers who can place orders for them.
// This is the model class for the Product entity. It is annotated with @Entity to indicate that it is a JPA entity.
// Its autolinked with the table name "products" using the @Table annotation.
package com.playground.ecommerce21.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "products")
public class Product {
    @Id
    private Long id;
    private String name;
    private BigDecimal price;
    private String description;
    private int quantity;
    private String image;

    public Product() {
        // Default constructor
    }

    public Product(Long id, String name, BigDecimal price, String description, int quantity, String image) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
        this.image = image;
    }

    // Getters and setters for all fields
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}