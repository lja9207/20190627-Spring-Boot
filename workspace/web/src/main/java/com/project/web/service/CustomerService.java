package com.project.web.service;

import java.util.List;


import com.project.web.domain.CustomerDTO; 

import org.springframework.stereotype.Component;

/**
 * CustomerService
 */
@Component
public interface CustomerService {

    public void addCustomer(CustomerDTO customer);

    public List<CustomerDTO> findCustomersByOption(CustomerDTO option);
    public CustomerDTO findCustomerByCustomerId(String customerId);
    public int updateCustomer(CustomerDTO customer);
    public void deleteCustomer(CustomerDTO customer);
    public int countAll();
    public CustomerDTO login(CustomerDTO customer);
    

    
}