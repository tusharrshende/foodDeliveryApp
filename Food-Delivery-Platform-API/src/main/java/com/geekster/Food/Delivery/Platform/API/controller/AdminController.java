package com.geekster.Food.Delivery.Platform.API.controller;

import com.geekster.Food.Delivery.Platform.API.model.Category;
import com.geekster.Food.Delivery.Platform.API.model.FoodItem;
import com.geekster.Food.Delivery.Platform.API.model.Order;
import com.geekster.Food.Delivery.Platform.API.service.FoodItemService;
import com.geekster.Food.Delivery.Platform.API.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {


    @Autowired
    FoodItemService foodItemService;

    @Autowired
    OrderService orderService;


    @PostMapping("foodItem")
    public String addFoodItem(@RequestBody FoodItem newFoodItem) {
      return foodItemService.addFoodItem(newFoodItem);
    }

    @PutMapping("foodItem/{id}")
    public String updateFoodItemById(@PathVariable Long id) {
       return foodItemService.updateFoodItemById(id);
    }

    @GetMapping("foodItem/{id}")
    public FoodItem getFoodItemById(@PathVariable Long id) {
        return foodItemService.getFoodItemById(id);
    }

    @DeleteMapping("foodItem/{id}")
    public String removeFoodItemById(@PathVariable Long id) {
        return foodItemService.removeFoodItemById(id);
    }
    @GetMapping("orders")
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }
}