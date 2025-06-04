package dev.patika.restapi.dto;

import dev.patika.restapi.entities.Customer;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerSaveRequest {

    @NotNull
    private String name;
    @Email
    private String mail;
    private Customer.GENDER gender;
}
