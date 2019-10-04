package com.hcl.ingproduct.repository;



import java.util.List;
import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.ingproduct.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	List<Product> findByCategoryId(Integer categoryId);

	Optional<Product> findByProductNameAndProductDescription(String productName, String productDescrition);

}
