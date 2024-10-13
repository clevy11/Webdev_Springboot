package com.auca.innovation.crm.core.sales.domain;

import com.auca.innovation.crm.core.customer.domain.Customer;
import com.auca.innovation.crm.core.product.domain.ProductCategory;
import com.auca.innovation.crm.core.utility.AbstactBaseEntity;
import com.auca.innovation.crm.core.utility.EsalesStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Sales extends AbstactBaseEntity {
    @Column(name= "status",nullable = false)

    private EsalesStatus status= EsalesStatus.INITIATED;
    @ManyToOne
    @JoinColumn(name="customer_id",nullable = false)
    private Customer customer;

    @OneToMany
    @JoinColumn(name="product_id",nullable = false)
    private List<ProductCategory> products;

}
