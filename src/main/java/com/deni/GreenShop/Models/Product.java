package com.deni.GreenShop.Models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
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

    @NotBlank(message = "Add the storeID")
    private int storeID;

    @NotBlank(message = "Add the product name")
    private String productName;

    @NotBlank(message = "Add the sale date")
    private Date saleDate;

    @NotBlank(message = "Add the expiry date")
    private Date expDate;

    private float regularPrice;

    @NotBlank(message = "Add the price")
    private float reducedPrice;

    private int productStock;

    private String prod_img_url;



}
