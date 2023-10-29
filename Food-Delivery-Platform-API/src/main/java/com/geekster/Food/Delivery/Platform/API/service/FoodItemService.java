package com.geekster.Food.Delivery.Platform.API.service;

import com.geekster.Food.Delivery.Platform.API.model.Category;
import com.geekster.Food.Delivery.Platform.API.model.FoodItem;
import com.geekster.Food.Delivery.Platform.API.model.authModel.AuthenticationInput;
import com.geekster.Food.Delivery.Platform.API.repo.IFoodItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodItemService {

    @Autowired
    IFoodItemRepo foodItemRepo;

    @Autowired
    AuthenticationService authenticationService;

    public List<FoodItem> getFoodItems(AuthenticationInput authInfo) {
        if (authenticationService.authenticate(authInfo)) {
            return foodItemRepo.findAll();
        }
        else {
            return null;
        }
    }


    public String addFoodItem(FoodItem newFoodItem) {
        foodItemRepo.save(newFoodItem);
        return newFoodItem.getFoodItemName() + " added successfully";
    }

    public String updateFoodItemById(Long id) {
        FoodItem food = foodItemRepo.findById(id).orElseThrow();
        food.setFoodItemName(food.getFoodItemName());
        food.setFoodItemCategory(food.getFoodItemCategory());
        food.setFoodItemPrice(food.getFoodItemPrice());
        foodItemRepo.save(food);
        return food.getFoodItemName() + " updated successfully";
    }

    public FoodItem getFoodItemById(Long id) {
       return foodItemRepo.findById(id).orElseThrow();
    }

    public String removeFoodItemById(Long id) {
        foodItemRepo.deleteById(id);
        return "food item removed successfully";
    }
}