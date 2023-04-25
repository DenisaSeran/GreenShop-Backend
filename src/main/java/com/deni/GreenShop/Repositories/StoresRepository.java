package com.deni.GreenShop.Repositories;

import com.deni.GreenShop.Models.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoresRepository extends JpaRepository<Store, Integer> {
}
