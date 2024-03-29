package com.amela.repository;

import com.amela.model.Customer;

public interface ICustomerRepository extends IGeneralRepository<Customer> {
    boolean insertWithStoredProcedure(Customer customer);
}
