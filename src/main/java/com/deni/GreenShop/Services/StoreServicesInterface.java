package com.deni.GreenShop.Services;

import com.deni.GreenShop.Errors.DeleteStoreNotFoundException;
import com.deni.GreenShop.Errors.StoreNotFoundException;
import com.deni.GreenShop.Models.Store;

import java.util.List;

public interface StoreServicesInterface {
    List<Store> showAllStores();
    Store showStoreByID(int storeID) throws StoreNotFoundException;
    Store addStore(Store store);
    void updateStore(Store newStore);
    void deleteStore(int storeID) throws DeleteStoreNotFoundException;
}
