package dev.patika.restapi.dto;


import dev.patika.restapi.entities.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerUpdateRequest {
    private int id;
    private String name;
    private Customer.GENDER gender;
}
