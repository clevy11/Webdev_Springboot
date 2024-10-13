package com.auca.innovation.crm.core.product.Domain;

import com.auca.innovation.crm.core.productcategory.domain.ProductCategory;
import com.auca.innovation.crm.core.utility.AbstactBaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;
import java.util.Set;

public class Product extends AbstactBaseEntity {
    @Column(name="serial_number",nullable = false)
    private String serialNumber;

    @Column(name="manufacture_date",nullable = false)
    private LocalDate manufactureDate;

    @Column(name = "expiration_date",nullable = false)
    private LocalDate expirationDate;

    @ManyToOne
    @JoinTable(
            name="product_belongs_to",
            joinColumns = @JoinColumn(name ="product_id"),
            inverseJoinColumns = @JoinColumn(name="category_id")
    )
    private Set<ProductCategory> categories;


}
