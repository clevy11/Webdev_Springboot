package com.auca.innovation.crm.core.product.repository;

import com.auca.innovation.crm.core.product.domain.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends JpaRepository<ProductCategory, Long> {
}
