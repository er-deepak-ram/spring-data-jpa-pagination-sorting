package com.google.springdatajpapaginationsorting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.springdatajpapaginationsorting.dto.APIResponse;
import com.google.springdatajpapaginationsorting.entity.Product;
import com.google.springdatajpapaginationsorting.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping
	public APIResponse<List<Product>> getProducts() {
		List<Product> allProducts = productService.findAllProducts();
		return new APIResponse<>(allProducts.size(), allProducts);
	}
}
