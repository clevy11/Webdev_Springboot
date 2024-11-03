package com.auca.innovation.crm.core.product.Domain;

import com.auca.innovation.crm.core.productcategory.domain.ProductCategory;
import com.auca.innovation.crm.core.utility.AbstactBaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter @Setter
@FieldNameConstants
public class Product extends AbstactBaseEntity {
    @Column(name="productName",nullable = false)
    private String productName;
    @Column(name="serial_number",nullable = false)
    private String serialNumber;

    @Column(name="manufacture_date",nullable = false)
    private LocalDate manufactureDate;

    @Column(name = "expiration_date",nullable = false)
    private LocalDate expirationDate;

    @ManyToMany
    @JoinTable(
            name="product_belongs_to",
            joinColumns = @JoinColumn(name ="product_id"),
            inverseJoinColumns = @JoinColumn(name="category_id")
    )
    private Set<ProductCategory> categories;


}
