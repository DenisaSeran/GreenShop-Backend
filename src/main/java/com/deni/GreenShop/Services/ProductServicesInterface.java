package com.deni.GreenShop.Services;

import com.deni.GreenShop.Errors.DeleteProductNotFoundException;
import com.deni.GreenShop.Errors.ProductNotFoundException;
import com.deni.GreenShop.Models.Product;

import java.util.List;

public interface ProductServicesInterface {
    List<Product> showAllProducts();
    Product showProductByID(int productID) throws ProductNotFoundException;
    Product addProduct(Product product);
    void updateProduct( Product newProduct) ;
    void deleteProduct(int productID) throws DeleteProductNotFoundException;
}
