package com.deni.GreenShop.Controllers;

import com.deni.GreenShop.Models.Store;
import com.deni.GreenShop.Services.StoreServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StoreController {
    @Autowired
    private StoreServices storeService;

    @GetMapping("/stores")
    public List<Store> showAllStores(){
        return storeService.showAllStores();
    }

    @GetMapping("/store/{id}")
    public Store showStoreByID(@PathVariable int storeID){
        return storeService.showStoreByID(storeID);
    }

    @PostMapping("/addStore")
    public Store addStore(@RequestBody Store store){
        return storeService.addStore(store);
    }

    @PutMapping("/updateStore")
    public void updateStore(@RequestBody Store store){
        storeService.updateStore(store);
    }

    @DeleteMapping("/deleteStore/{id}")
    public void deleteStore(@PathVariable int storeID){
        storeService.deleteStore(storeID);
    }

}
