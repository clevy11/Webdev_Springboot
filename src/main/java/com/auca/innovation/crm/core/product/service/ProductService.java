package com.auca.innovation.crm.core.product.service;

import com.auca.innovation.crm.core.product.Domain.Product;
import com.auca.innovation.crm.core.product.repository.IProductrepository;
import com.auca.innovation.crm.core.productcategory.domain.ProductCategory;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ProductService implements IProductService {
//    @Autowired private IProductrepository productRepository;
      private final IProductrepository productRepository;

//    public ProductService(IProductrepository productrepository) {
//        this.productrepository = productrepository;
//    }

    @Override
    public Product registerProduct(Product theproduct) {
        return productRepository.save(theproduct);
    }

    @Override
    public List<Product> findAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Page<Product> findAllProduct(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public List<Product> findAllProductBycategory(ProductCategory category) {
        return productRepository.findAllProductByCategoriesContaining(category);
    }
}
