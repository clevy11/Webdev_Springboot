package com.auca.innovation.crm.core.product.domain;

import com.auca.innovation.crm.core.utility.AbstactBaseEntity;
import com.auca.innovation.crm.core.utility.EUnit;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
@Entity
@Getter @Setter
public class ProductCategory extends AbstactBaseEntity {
    @Column(name="product_categoryname",nullable = false,unique = true)
    private Integer productCategoryName;
    @Column(name="unit_Price",nullable=false)
    private BigDecimal UnitPrice;
    @Column(name = "quantity",nullable = false)
    private Double quantity;

    @Column(name = "unit",nullable = false)
    private EUnit unit;

}
