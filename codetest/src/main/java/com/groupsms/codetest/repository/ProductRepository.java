package com.groupsms.codetest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.groupsms.codetest.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
