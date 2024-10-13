package com.auca.innovation.crm.core.productcategory.repository;

import com.auca.innovation.crm.core.productcategory.domain.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends JpaRepository<ProductCategory, Long> {
}
