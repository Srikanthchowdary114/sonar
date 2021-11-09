package com.amazon.market.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amazon.market.product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, String>{

	List<Product> findByproductname(String productname);
	List<Product> findBycategory(String category);
	List<Product> findBysellerid(String sellerid);
	Product findByProdid(String prodid);

}
