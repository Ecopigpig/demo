package com.example.productviewservicefeign.service;

import com.example.productviewservicefeign.client.ProductClientFeign;
import com.example.productviewservicefeign.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Qualifier("PRODUCT-DATA-SERVICE")
    @Autowired
    ProductClientFeign productClientFeign;

    public List<Product> listProducts(){
        return productClientFeign.listProducts();
    }
}
