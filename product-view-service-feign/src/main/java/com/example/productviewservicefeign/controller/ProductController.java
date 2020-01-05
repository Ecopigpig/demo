package com.example.productviewservicefeign.controller;

import com.example.productviewservicefeign.pojo.Product;
import com.example.productviewservicefeign.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Configuration
@Controller
@RefreshScope
public class ProductController {

    @Autowired
    ProductService productService;

    @Value("${version}")
    String version;

    @RequestMapping("/products")
    public Object products(Model m){
        List<Product> ps = productService.listProducts();
        m.addAttribute("version",version);
        m.addAttribute("ps",ps);
        return "products";
    }

}
