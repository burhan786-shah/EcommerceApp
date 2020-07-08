package com.springboot.ecommerce.service;

import java.lang.reflect.InvocationTargetException;

import com.springboot.ecommerce.dto.ProductRequestDto;
import com.springboot.ecommerce.dto.ProductResponseDto;

public interface ProductService {
	
	public ProductResponseDto addProduct(ProductRequestDto productRequestDto) throws IllegalAccessException, InvocationTargetException;

}
