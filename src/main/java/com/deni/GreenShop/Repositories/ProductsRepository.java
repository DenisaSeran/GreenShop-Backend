package com.deni.GreenShop.Repositories;

import com.deni.GreenShop.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductsRepository extends CrudRepository<Product, Integer> {


}
