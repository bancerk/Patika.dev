package dev.patika.restapi.api;

import dev.patika.restapi.business.abstracts.ICustomerService;
import dev.patika.restapi.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @GetMapping("/customers")
    @ResponseStatus(HttpStatus.OK)
    public List<Customer> findAll() {
        return this.customerService.findAll();
    }

    @PostMapping("/customers")
    @ResponseStatus(HttpStatus.CREATED)
    public Customer save(@RequestBody Customer customer) {
        return this.customerService.save(customer);
    }

    @PutMapping("/customers")
    @ResponseStatus(HttpStatus.OK)
    public Customer update(@RequestBody Customer customer) {
        return this.customerService.save(customer);
    }

    @DeleteMapping("/customers/{id}")
    public void delete(@PathVariable("id") int id) {
        this.customerService.delete(id);
    }

    @GetMapping("/customers/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Customer getById(@PathVariable("id") int id) {
        return this.customerService.getById(id);
    }

}
