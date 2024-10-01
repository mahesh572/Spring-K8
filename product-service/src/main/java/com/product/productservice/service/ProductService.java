package com.product.productservice.service;

import java.util.List;

import com.product.request.payload.ProductRequest;
import com.product.response.payload.ProductResponse;
import com.product.service.entity.Product;

public interface ProductService {

    long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(long productId);

    void reduceQuantity(long productId, long quantity);

    public void deleteProductById(long productId);
    
    public List<Product> getAllproducts();
}