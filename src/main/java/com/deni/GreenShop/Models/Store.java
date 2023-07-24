package com.deni.GreenShop.Models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "store")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int storeID;

    @NotBlank(message = "Add the store name")
    private String storeName;

    @NotBlank(message = "Add the store country")
    private String storeCountry;

    @NotBlank(message = "Add the store city")
    private String storeCity;

    private String storeStreet;

    private int storeNr;

    private String imageUrl;





}
