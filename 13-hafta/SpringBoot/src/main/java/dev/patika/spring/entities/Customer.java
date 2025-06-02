package dev.patika.spring.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "customers")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
// @Data includes @Getter, @Setter, @ToString, @RequiredArgsConstructor and @EqualsAndHashCode
// since it doesn't give you @AllArgsConstructor, if you add @AllArgsConstructor manually, you also have to add @NoArgsConstructor due to overriding
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id", columnDefinition = "serial")
    private int id; //customer_id

    @Column(name = "customer_name", length = 100, nullable = false)
    private String name; //customer_name

    @Column(name = "customer_mail", unique = true, nullable = false)
    private String mail;

    @Temporal(TemporalType.DATE)
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
