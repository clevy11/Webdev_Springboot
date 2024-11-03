package com.auca.innovation.crm.core.product.service;

import com.auca.innovation.crm.core.product.Domain.Product;
import com.auca.innovation.crm.core.productcategory.domain.ProductCategory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;

public interface IProductService {
    Product registerProduct(Product theproduct);
    List<Product> findAllProduct();
    Page<Product> findAllProduct(Pageable pageable);
    List<Product> findAllProductBycategory(ProductCategory category);
}
