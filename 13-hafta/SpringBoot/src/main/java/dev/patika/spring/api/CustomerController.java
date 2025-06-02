package dev.patika.spring.api;

import dev.patika.spring.business.abstracts.ICustomerService;
import dev.patika.spring.entities.Customer;
import dev.patika.spring.dao.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    // Dependency Injection - IOC
    // Constructor
    private final CustomerRepo customerRepo;

    public CustomerController(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    //Alternative - Setter
    /*
    @Autowired
    private ICustomerService(ICustomerService customerService){
        this.customerService = customerService;
    }
    */

    //Alternative 2 - Field
    /*
    @Autowired
    private ICustomerService customerService;
    */

    @GetMapping
    public Customer findById(@PathVariable("id") int id) {
        return this.customerRepo.findById(id).orElseThrow();
    }

    @PostMapping("/save")
    public Customer save(@RequestBody Customer customer) {
        return this.customerRepo.save(customer);
    }

    @GetMapping("/find-all")
    public List<Customer> findAll() {
        return this.customerRepo.findAll();
    }

    @GetMapping("/find/{mail}")
    public Customer findByMail(@PathVariable("mail") String mail) {
        return this.customerRepo.findByMail(mail);
    }

    @GetMapping("/find/{mail}/{gender}")
    public Customer findByMailAndGender(@PathVariable("mail") String mail, @PathVariable("gender") Customer.GENDER gender) {
        return this.customerRepo.findByMailAndGender(mail, gender);
    }

    @GetMapping("/find/{gender}")
    public List<Customer> findByGender(@PathVariable("gender") Customer.GENDER gender) {
        return this.customerRepo.findByGender(gender);
    }
}
