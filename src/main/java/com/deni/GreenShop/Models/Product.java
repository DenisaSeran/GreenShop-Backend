package com.deni.GreenShop.Models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;


import java.util.Date;
@Entity
@Table(name = "product")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productID;

    @NotNull(message = "Add the storeID")
    private int storeID;

    @NotBlank(message = "Add the product name")
    private String productName;

    private Date saleDate;

    private Date expDate;

    @NotNull(message = "Add the regular price")
    private float regularPrice;

    @NotNull(message = "Add the reduced price")
    private float reducedPrice;

    private int productStock;

    private String prod_img_url;



}
