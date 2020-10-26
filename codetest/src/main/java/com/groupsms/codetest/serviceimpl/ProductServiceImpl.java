package com.groupsms.codetest.serviceimpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groupsms.codetest.model.BaseResponse;
import com.groupsms.codetest.model.Product;
import com.groupsms.codetest.repository.ProductRepository;
import com.groupsms.codetest.service.ProductService;

@Transactional
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;
	
	@Override
	public BaseResponse<List<Product>> getAllProducts() {
		try {
			BaseResponse<List<Product>> baseList = new BaseResponse<List<Product>>();
			List<Product> products = productRepository.findAll();
			if(products.isEmpty())
			{
				baseList.setEmptyResponse();
			}
			else
			{
				baseList.setSuccessResponse(products);
			}
			return baseList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public BaseResponse<Product> addProduct(Product product) {
			try {
				BaseResponse<Product> baseProduct = new BaseResponse<Product>();
				product = productRepository.save(product);
				baseProduct.setSuccessResponse(product);
				return baseProduct;
			} catch (Exception e) {
				e.printStackTrace();
			}
		return null;
	}

	@Override
	public BaseResponse<Product> updateProduct(Product product) {
		try {
			BaseResponse<Product> baseProduct = new BaseResponse<Product>();
			product = productRepository.save(product);
			baseProduct.setSuccessResponse(product);
			return baseProduct;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Boolean deleteProduct(Long productId) {
		try {
			productRepository.deleteById(productId);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public BaseResponse<Product> getProductById(Long productId) {
		try {
			BaseResponse<Product> baseProduct = new BaseResponse<Product>();
			Optional<Product> product = productRepository.findById(productId);
			baseProduct.setSuccessResponse(product.get());
			return baseProduct;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
