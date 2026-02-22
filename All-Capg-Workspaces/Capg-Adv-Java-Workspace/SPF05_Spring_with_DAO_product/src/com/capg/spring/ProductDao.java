package com.capg.spring;

public interface ProductDao {

    public void save(ProductBean bean);

    public ProductBean get(int productId);

    public int updateProductName(int productId, String newName);

    public int removeProduct(int productId);
}