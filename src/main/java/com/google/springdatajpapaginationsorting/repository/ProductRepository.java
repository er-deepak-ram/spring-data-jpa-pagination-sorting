package com.google.springdatajpapaginationsorting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.google.springdatajpapaginationsorting.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
