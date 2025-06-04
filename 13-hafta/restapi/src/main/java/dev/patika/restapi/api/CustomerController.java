package dev.patika.restapi.api;

import dev.patika.restapi.business.abstracts.ICustomerService;
import dev.patika.restapi.dto.CustomerResponse;
import dev.patika.restapi.dto.CustomerDtoConverter;
import dev.patika.restapi.dto.CustomerSaveRequest;
import dev.patika.restapi.dto.CustomerUpdateRequest;
import dev.patika.restapi.entities.Customer;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/v1")
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @Autowired
    private CustomerDtoConverter converter;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/customers")
    @ResponseStatus(HttpStatus.OK)
    //Refactor to Dto, with 1 line
/*    public List<CustomerResponse> findAll() {
        return this.customerService.findAll().stream().map(customer -> this.converter.convertDto(customer)).toList();
    }*/
    //Refactor to Dto, with ModelMapper
    public List<CustomerResponse> findAll() {
        List<CustomerResponse> customerResponseList = this.customerService
                .findAll()
                .stream()
                .map(customer -> this.modelMapper.map(customer, CustomerResponse.class))
                .toList();
        return customerResponseList;
    }

    @PostMapping("/customers")
    @ResponseStatus(HttpStatus.CREATED)
    //Refactored with ModelMapper and CustomerSaveRequest
    public Customer save(@RequestBody CustomerSaveRequest customerSaveRequest) {
        Customer newCustomer = this.modelMapper.map(customerSaveRequest, Customer.class);
        newCustomer.setOnDate(LocalDate.now());
        return this.customerService.save(newCustomer);
    }

    @PutMapping("/customers")
    @ResponseStatus(HttpStatus.OK)
    //Refactored with ModelMapper and CustomerUpdateRequest
    public Customer update(@RequestBody CustomerUpdateRequest customerUpdateRequest) {
        Customer updatedCustomer = this.customerService.getById(customerUpdateRequest.getId());
        updatedCustomer.setName(customerUpdateRequest.getName());
        updatedCustomer.setGender(customerUpdateRequest.getGender());
        return this.customerService.update(updatedCustomer);
    }

    @DeleteMapping("/customers/{id}")
    public void delete(@PathVariable("id") int id) {
        this.customerService.delete(id);
    }

    @GetMapping("/customers/{id}")
    @ResponseStatus(HttpStatus.OK)
    public CustomerResponse getById(@PathVariable("id") int id) {
        //Refactored to use Dto Converter
        Customer customer = this.customerService.getById(id);
        CustomerResponse customerResponse = this.converter.convertDto(customer);
        return customerResponse;
        //Alternative - 1 Line
        //return this.converter.convertDto(this.customerService.getById(id));
    }

}
