package dev.patika.spring.business.concretes;


import dev.patika.spring.business.abstracts.ICustomerService;
import dev.patika.spring.dao.CustomerRepo;
import dev.patika.spring.entities.Customer;

public class CustomerManager implements ICustomerService {

    private final CustomerRepo customerRepo;

    public CustomerManager(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    @Override
    public Customer getById(int id) {
        return this.customerRepo.findById(id).orElseThrow();
    }

    @Override
    public Customer save(Customer customer) {
        return this.customerRepo.save(customer);
    }

    @Override
    public void delete(Customer customer) {
        this.customerRepo.delete(customer);
    }

    @Override
    public Customer update(Customer customer) {
        if (customer.getId() == 0) {
            throw new RuntimeException("lütfen id değeri olan bir entity giriniz.");
        }
        return this.customerRepo.save(customer);
    }
}
