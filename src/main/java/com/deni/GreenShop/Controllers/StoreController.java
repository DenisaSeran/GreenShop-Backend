package com.deni.GreenShop.Controllers;

import com.deni.GreenShop.Errors.DeleteStoreNotFoundException;
import com.deni.GreenShop.Errors.StoreNotFoundException;
import com.deni.GreenShop.Models.Store;
import com.deni.GreenShop.Services.StoreServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:4200/stores"})
@RestController
public class StoreController {
    @Autowired
    private StoreServices storeService;
    @CrossOrigin(origins = {"http://localhost:4200", "http://localhost:4200/stores"})
    @GetMapping("/stores")
    public List<Store> showAllStores(){
        return storeService.showAllStores();
    }

    @CrossOrigin(origins = {"http://localhost:4200", "http://localhost:4200/stores"})
    @GetMapping("/store/{storeID}")
    public Store showStoreByID (@PathVariable int storeID) throws StoreNotFoundException {
        return storeService.showStoreByID(storeID);
    }

    @PostMapping("/addStore")
    public Store addStore(@RequestBody Store store){
        return storeService.addStore(store);
    }

    @PutMapping("/updateStore")
    public void updateStore( @RequestBody Store store) {
        storeService.updateStore(store);
    }

    @DeleteMapping("/deleteStore/{storeID}")
    public void deleteStore(@PathVariable int storeID) throws DeleteStoreNotFoundException {
        storeService.deleteStore(storeID);
    }

}
