package com.example.productviewserviceribbon.service;

import com.example.productviewserviceribbon.client.ProductClientRibbon;
import com.example.productviewserviceribbon.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductClientRibbon productClientRibbon;

    public List<Product> listProducts(){
        return productClientRibbon.listProducts();
    }
}
