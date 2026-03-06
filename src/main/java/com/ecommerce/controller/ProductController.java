 package com.ecommerce.controller;

import com.ecommerce.entity.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "https://frontenddecommercemyfirstproject.netlify.app")
public class ProductController {

    @GetMapping("/products")
    public List<Product> getProducts(jakarta.servlet.http.HttpServletRequest request) {

        String baseUrl = System.getenv("BASE_URL");
        if (baseUrl == null || baseUrl.isEmpty()) {
            baseUrl = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort();
        }

        final String finalBaseUrl = baseUrl;

        return List.of(
            new Product(1L, "powder", 150, finalBaseUrl + "/images/img1.webp"),
            new Product(2L, "dress", 600, finalBaseUrl + "/images/img%202.webp"),
            new Product(3L, "shoes", 2000, finalBaseUrl + "/images/img%203.webp"),
            new Product(4L, "watch", 1500, finalBaseUrl + "/images/img%204.webp"),
            new Product(5L, "shirt", 800, finalBaseUrl + "/images/img%205.webp"),
            new Product(6L, "camera", 12000, finalBaseUrl + "/images/img%206.webp"),
            new Product(7L, "perfume", 2500, finalBaseUrl + "/images/img%207.webp"),
            new Product(8L, "products", 3000, finalBaseUrl + "/images/img%208.webp"),
            new Product(9L, "dress", 1800, finalBaseUrl + "/images/img%209.webp"),
            new Product(10L, "Smart phone", 55000, finalBaseUrl + "/images/img%2010.webp"),
            new Product(11L, "Mobiles", 45000, finalBaseUrl + "/images/img%2011.webp"),
            new Product(12L, "TV", 20000, finalBaseUrl + "/images/img%2012.webp"),
            new Product(13L, "Monitor", 155500, finalBaseUrl + "/images/img%2013.webp"),
            new Product(14L, "Calculator", 700, finalBaseUrl + "/images/img%2014.webp"),
            new Product(15L, "Book", 498, finalBaseUrl + "/images/img%2015.webp")
        );
    }
}
