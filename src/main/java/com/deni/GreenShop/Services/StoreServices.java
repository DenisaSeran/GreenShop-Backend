package com.deni.GreenShop.Services;

import com.deni.GreenShop.Models.Customer;
import com.deni.GreenShop.Models.Store;
import com.deni.GreenShop.Repositories.StoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class StoreServices implements StoreServicesInterface{
    @Autowired
    public StoresRepository storesRepository;
    @Override
    public List<Store> showAllStores() {
        List<Store> stores = new ArrayList<>();
       storesRepository.findAll()
                .forEach(stores::add);

        return stores;
    }

    @Override
    public Store showStoreByID(int storeID) {
        return storesRepository.findById(storeID).orElse(null);
    }

    @Override
    public Store addStore(Store store) {
        return storesRepository.save(store);
    }

    @Override
    public void updateStore(Store newStore) {
        Store storeToUpdate = storesRepository.findById(newStore.getStoreID()).orElse(null);
        storeToUpdate.setStoreName(newStore.getStoreName());
        storeToUpdate.setStoreID(newStore.getStoreID());
        storeToUpdate.setStoreCountry(newStore.getStoreCountry());
        storeToUpdate.setStoreCity(newStore.getStoreCity());
        storeToUpdate.setStoreStreet(newStore.getStoreStreet());
        storeToUpdate.setStoreNr(newStore.getStoreNr());
        storesRepository.save(storeToUpdate);
    }

    @Override
    public void deleteStore(int storeID) {
        storesRepository.deleteById(storeID);

    }
}
