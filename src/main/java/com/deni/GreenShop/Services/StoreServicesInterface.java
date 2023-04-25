package com.deni.GreenShop.Services;

import com.deni.GreenShop.Models.Product;
import com.deni.GreenShop.Models.Store;

import java.util.List;

public interface StoreServicesInterface {
    List<Store> showAllStores();
    Store showStoreByID(int storeID);
    Store addStore(Store store);
    void updateStore(Store newStore);
    void deleteStore(int storeID);
}
