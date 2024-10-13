package com.auca.innovation.crm.core.customer.service;

import com.auca.innovation.crm.core.customer.domain.Customer;

import java.util.List;
import java.util.UUID;

public interface ICustomerService {
    Customer createCustomer(Customer customer);
    Customer updateCustomer(Customer customer);
    Customer voidCustomer(Customer customer);
    List<Customer> findAllCustomers();
    Customer findCustomerById(UUID id);

}
