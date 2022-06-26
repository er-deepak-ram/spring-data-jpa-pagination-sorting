package com.google.springdatajpapaginationsorting.service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.springdatajpapaginationsorting.entity.Product;
import com.google.springdatajpapaginationsorting.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
//	@PostConstruct
//	public void initDB() {
//		List<Product> products = IntStream.rangeClosed(1, 200)
//				.mapToObj(i -> new Product("product"+i, new Random().nextInt(90), new Random().nextInt(3000)))
//				.collect(Collectors.toList());
//		productRepository.saveAll(products);
//	}
	
	public List<Product> findAllProducts() {
		return productRepository.findAll();
	}
}
