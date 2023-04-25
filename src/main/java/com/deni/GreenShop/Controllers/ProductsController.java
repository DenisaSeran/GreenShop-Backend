package com.deni.GreenShop.Controllers;

import com.deni.GreenShop.Models.Product;
import com.deni.GreenShop.Services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductsController {
    @Autowired
    private ProductServices prodService;
    @GetMapping("/products")
    public List<Product> showAllProducts(){
        return prodService.showAllProducts();
    }
    @GetMapping("/product/{id}")
    public Product showProductByID(@PathVariable int productID){

        return prodService.showProductByID(productID);
    }

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return prodService.addProduct(product);
    }

    @PutMapping("/updateProduct")
    public void updateProduct(@RequestBody Product product){

        prodService.updateProduct(product);
    }

    @DeleteMapping("/deleteProduct/{id}")
    public void deleteProduct(@PathVariable int productID){

        prodService.deleteProduct(productID);
    }




}
