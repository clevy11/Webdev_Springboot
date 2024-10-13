package com.auca.innovation.crm.core.customer.domain;


import com.auca.innovation.crm.core.utility.AbstactBaseEntity;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Customer extends AbstactBaseEntity {
    @Column(name="firstname",nullable = false)
    private String firstname;
    @Column(name="lastname",nullable = false)
    private String lastname;
    @Column(name="email",nullable = false)
    private String email;
    @Column(name="phonenumber",nullable = false)
    private String phonenumber;



}
