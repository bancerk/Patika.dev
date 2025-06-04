package dev.patika.restapi.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "customers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id", columnDefinition = "serial")
    private int id; //customer_id

    @Column(name = "customer_name", length = 100, nullable = false)
    @NotNull
    private String name; //customer_name

    @Column(name = "customer_mail", unique = true, nullable = false)
    @Email(message = "lütfen geçerli bir email adresi giriniz") // spring boot starter validation paketi ile bu özelliği ekledik
    private String mail;

    @Column(name = "customer_on_date")
    private LocalDate onDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "customer_gender")
    private GENDER gender;

    public enum GENDER {
        MALE,
        FEMALE
    }
}
