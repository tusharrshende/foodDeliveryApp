package com.geekster.Food.Delivery.Platform.API.controller;

import com.geekster.Food.Delivery.Platform.API.model.*;
import com.geekster.Food.Delivery.Platform.API.model.authModel.AuthenticationInput;
import com.geekster.Food.Delivery.Platform.API.service.AddressService;
import com.geekster.Food.Delivery.Platform.API.service.FoodItemService;
import com.geekster.Food.Delivery.Platform.API.service.OrderService;
import com.geekster.Food.Delivery.Platform.API.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    FoodItemService foodItemService;

    @Autowired
    OrderService orderService;

    @Autowired
    AddressService addressService;


    @PostMapping("user/signUp")
    public String userSignUp(@RequestBody User newUser) {
       return userService.userSignUp(newUser);
    }

    //sign in
    @PostMapping("user/signIn/{email}/{password}")
    public String userSignIn(@PathVariable String email, @PathVariable String password)
    {
        return userService.userSignIn(email,password);
    }

    //sign out
    @DeleteMapping("user/signOut")
    public String userSignOut(AuthenticationInput authInfo)
    {
        return userService.userSignOut(authInfo);
    }

    //get all foodItems
    @GetMapping("foodItems")
    public List<FoodItem> getFoodItems(@RequestBody AuthenticationInput authInfo ) {
        return foodItemService.getFoodItems(authInfo);
    }

    @PostMapping("order")
    public String createOrder(@RequestParam AuthenticationInput authInfo, @RequestBody Order newOrder) {
        return orderService.createOrder(authInfo,newOrder);
    }

    @DeleteMapping("order/{id}")
    public String cancelOrderById(Long id) {
        return orderService.cancelOrderById(id);
    }

    @PostMapping("address")
    public String createAddress(@RequestParam AuthenticationInput authInfo, @RequestBody Address newAddress) {
       return addressService.createAddress(authInfo, newAddress);
    }

}
