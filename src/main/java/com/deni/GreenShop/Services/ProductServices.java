package com.deni.GreenShop.Services;

import com.deni.GreenShop.Errors.DeleteProductNotFoundException;
import com.deni.GreenShop.Errors.ProductNotFoundException;
import com.deni.GreenShop.Models.Product;
import com.deni.GreenShop.Repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServices implements ProductServicesInterface {
    @Autowired
    public ProductsRepository productRepository;

    public List<Product> findByProductName(String searchValue) {
        List<Product> products = new ArrayList<>();
        if ("".equals(searchValue)) {
            return productRepository.findAll();
        } else {
            System.out.println(productRepository.findByProductName(searchValue));
            return productRepository.findByProductName(searchValue);
        }
    }

    public List<Product> showAllProducts() {
        List<Product> products = new ArrayList<>();
        productRepository.findAll()
                .forEach(products::add);
        return products;
    }

    public Product showProductByID(int productID) throws ProductNotFoundException {

        Optional<Product> product = productRepository.findById(productID);

        if (!product.isPresent()) {
            throw new ProductNotFoundException("Product with the ID of " + productID + " not found");
        }
        return product.get();

    }

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public void updateProduct(Product newProduct) {
        Product productToUpdate = productRepository.findById(newProduct.getProductID()).orElse(null);
        productToUpdate.setProductName(newProduct.getProductName());
        productToUpdate.setStoreID(newProduct.getStoreID());
        productToUpdate.setSaleDate(newProduct.getSaleDate());
        productToUpdate.setExpDate(newProduct.getExpDate());
        productToUpdate.setRegularPrice(newProduct.getRegularPrice());
        productToUpdate.setReducedPrice(newProduct.getReducedPrice());
        productToUpdate.setProductStock(newProduct.getProductStock());
        productRepository.save(productToUpdate);
    }


    public void deleteProduct(int productID) throws DeleteProductNotFoundException {
        Optional<Product> product = productRepository.findById(productID);

        if (!product.isPresent()) {
            throw new DeleteProductNotFoundException("Product to be deleted with the ID of " + productID + " does not exist");
        }
        productRepository.deleteById(productID);
    }


}
