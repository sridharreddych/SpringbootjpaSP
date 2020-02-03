package com.sp.SpringbootjpaSP.services;

import java.math.BigDecimal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.sp.SpringbootjpaSP.entities.Product;
import com.sp.SpringbootjpaSP.repositories.ProductRepository;


@Transactional
@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> findAllBetweenStoredProcedure(BigDecimal min, BigDecimal max) {
		return productRepository.findAllBetweenStoredProcedure(min, max);
	}

}