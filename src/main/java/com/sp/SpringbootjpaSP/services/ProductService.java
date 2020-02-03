package com.sp.SpringbootjpaSP.services;

import java.math.BigDecimal;
import java.util.List;
import com.sp.SpringbootjpaSP.entities.Product;

public interface ProductService {

	public List<Product> findAllBetweenStoredProcedure(BigDecimal min, BigDecimal max);

}