package com.example.Cursor_HW8.web.rest;

import com.example.Cursor_HW8.entity.Shop;
import com.example.Cursor_HW8.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ShopController {

    @Autowired
    private ShopService shopService;

    @PostMapping("/shops")
    @ResponseStatus(HttpStatus.CREATED)
    public Shop createShop(@RequestBody Shop shop) {
        return shopService.createShop(shop);
    }

    @DeleteMapping("/shops/{id}")
    public void deleteShop(@PathVariable Long id) {
        shopService.deleteShop(id);
    }

    @GetMapping("/shops")
    public List<Shop> getAllShops() {
        return shopService.getAllShops();
    }

    @GetMapping("/shops/{id}")
    public Shop getShopById(@PathVariable Long id) {
        return shopService.getShopById(id);
    }

    @PutMapping("/shops/{id}")
    public Shop updateShop(@PathVariable Long id, @RequestBody Shop shop) {
        return shopService.updateShop(id, shop);
    }

}
