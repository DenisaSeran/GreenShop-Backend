package com.deni.GreenShop.Services;

import com.deni.GreenShop.Models.Product;

import java.util.List;

public interface ProductServicesInterface {
    List<Product> showAllProducts();
    Product showProductByID(int productID);
    Product addProduct(Product product);
    void updateProduct(Product newProduct);
    void deleteProduct(int productID);
}
