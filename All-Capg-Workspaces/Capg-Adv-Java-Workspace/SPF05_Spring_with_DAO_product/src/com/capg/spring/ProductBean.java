package com.capg.spring;

import java.io.Serializable;

public class ProductBean implements Serializable {

    private int productId;
    private String productName;
    private String category;
    private String manufacturer;

    ProductBean() {
    }

    public ProductBean(int productId, String productName, String category, String manufacturer) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.manufacturer = manufacturer;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Product [productId=" + productId + ", productName=" + productName + ", category=" + category + ", manufacturer=" + manufacturer + "]";
    }
}