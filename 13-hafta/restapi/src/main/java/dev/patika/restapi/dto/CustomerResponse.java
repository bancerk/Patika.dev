package dev.patika.restapi.dto;

import dev.patika.restapi.entities.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
// Pojo class
// Customer -> CustomerDto
public class CustomerResponse {
    //Renamed from CustomerResponse
    private int id;
    private String name;
    private String mail;
    private Customer.GENDER gender;

}
