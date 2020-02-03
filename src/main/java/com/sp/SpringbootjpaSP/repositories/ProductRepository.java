package com.sp.SpringbootjpaSP.repositories;

import java.math.BigDecimal;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.sp.SpringbootjpaSP.entities.Product;

@Repository("productRepository")
public interface ProductRepository extends CrudRepository<Product, Integer> {

	@Query(value = "{call sp_findBetween(:min, :max)}", nativeQuery = true)
	public List<Product> findAllBetweenStoredProcedure(@Param("min") BigDecimal min, @Param("max") BigDecimal max);

}