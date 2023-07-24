package com.deni.GreenShop.Controllers;

import com.deni.GreenShop.Models.Product;
import com.deni.GreenShop.Services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:4200/products"})
@RestController
public class ProductsController {
    @Autowired
    private ProductServices prodService;


    @CrossOrigin(origins = {"http://localhost:4200", "http://localhost:4200/products"})
    @GetMapping("/products")
    public List<Product> showAllProducts(){
        return prodService.showAllProducts();
    }
    @CrossOrigin(origins = {"http://localhost:4200", "http://localhost:4200/products"})
    @GetMapping("/products/{productName}")
    public List<Product> showAllProducts(@RequestParam(defaultValue = "") String searchValue){
        return prodService.findByProductName(searchValue);
    }

    @CrossOrigin(origins = {"http://localhost:4200", "http://localhost:4200/products"})
    @GetMapping("/product/{productID}")
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
