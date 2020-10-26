package com.groupsms.codetest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.groupsms.codetest.model.BaseResponse;
import com.groupsms.codetest.model.Product;
import com.groupsms.codetest.service.ProductService;

@RestController
@CrossOrigin
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public ResponseEntity<BaseResponse<List<Product>>> getAllProducts()
	{
		return new ResponseEntity<BaseResponse<List<Product>>>(productService.getAllProducts(),HttpStatus.OK);
	}
	
	@RequestMapping(value = "/products", method = RequestMethod.POST)
	public ResponseEntity<BaseResponse<Product>> addProduct(@RequestBody Product product)
	{
		return new ResponseEntity<BaseResponse<Product>>(productService.addProduct(product),HttpStatus.OK);
	}
	
	@RequestMapping(value = "/products", method = RequestMethod.PUT)
	public ResponseEntity<BaseResponse<Product>> updateProduct(@RequestBody Product product)
	{
		return new ResponseEntity<BaseResponse<Product>>(productService.updateProduct(product),HttpStatus.OK);
	}
	
	@RequestMapping(value = "/products/{productId}", method = RequestMethod.DELETE)
	public ResponseEntity<BaseResponse<Boolean>> deleteProduct(@PathVariable Long productId)
	{ 
		productService.deleteProduct(productId);
		return new ResponseEntity<BaseResponse<Boolean>>(HttpStatus.OK);
	}
	
	@RequestMapping(value = "/products/{productId}", method = RequestMethod.GET)
	public ResponseEntity<BaseResponse<Product>> getProductById(@PathVariable Long productId)
	{
		return new ResponseEntity<BaseResponse<Product>> (productService.getProductById(productId),HttpStatus.OK);
	}
	
	
}
