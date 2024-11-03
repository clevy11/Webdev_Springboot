package com.auca.innovation.crm.core.product.repository;

import com.auca.innovation.crm.core.product.Domain.Product;
import com.auca.innovation.crm.core.productcategory.domain.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Repository
public interface IProductrepository extends JpaRepository<Product, UUID> {

    List<Product> findProductByCategories(Set<ProductCategory> categories);

    List<Product> findAllProductByCategoriesContaining(ProductCategory category);
}
