package dev.patika.restapi.dto;

import dev.patika.restapi.entities.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerDtoConverter {

    public CustomerResponse convertDto (Customer customer){
        CustomerResponse customerResponse = new CustomerResponse();
        customerResponse.setId(customer.getId());
        customerResponse.setName(customer.getName());
        customerResponse.setMail(customer.getMail());

        return customerResponse;

        // Alternative
        /*
        return new CustomerResponse(
                customer.getId(),
                customer.getName(),
                customer.getMail()
        );
         */
    }
}
