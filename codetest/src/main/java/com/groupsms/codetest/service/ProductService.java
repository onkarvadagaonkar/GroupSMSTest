package com.groupsms.codetest.service;

import java.util.List;
import com.groupsms.codetest.model.BaseResponse;
import com.groupsms.codetest.model.Product;

public interface ProductService {
	
	public BaseResponse<List<Product>> getAllProducts();
	
	public BaseResponse<Product> addProduct(Product product);
	
	public BaseResponse<Product> updateProduct(Product product);
	
	public Boolean deleteProduct(Long productId);
	
	public BaseResponse<Product> getProductById(Long productId);
}
