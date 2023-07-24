package com.deni.GreenShop.Models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.hibernate.validator.constraints.Length;


@Entity
@Table(name = "customer")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

        @Id
        @GeneratedValue( strategy = GenerationType.IDENTITY)
        private int customerid;

        @NotBlank(message = "Add the name")
        private String customerName;

        @NotBlank(message = "Add the email")
        private String customerEmail;

        @Length(min=10)
        @NotBlank(message = "Add the password")
        private String customerPass;

        private String customerCountry;

        private String customerCity;


}
