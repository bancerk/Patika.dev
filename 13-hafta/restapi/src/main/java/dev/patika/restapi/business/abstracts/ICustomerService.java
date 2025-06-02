package dev.patika.restapi.business.abstracts;

import dev.patika.restapi.entities.Customer;

import java.util.List;

public interface ICustomerService {
    Customer getById(int id);

    Customer save(Customer customer);

    Customer update(Customer customer);

    void delete(int id);

    List<Customer> findAll();
}
