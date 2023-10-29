package com.geekster.Food.Delivery.Platform.API.service;

import com.geekster.Food.Delivery.Platform.API.model.FoodItem;
import com.geekster.Food.Delivery.Platform.API.model.Order;
import com.geekster.Food.Delivery.Platform.API.model.User;
import com.geekster.Food.Delivery.Platform.API.model.authModel.AuthenticationInput;
import com.geekster.Food.Delivery.Platform.API.repo.IFoodItemRepo;
import com.geekster.Food.Delivery.Platform.API.repo.IOrderRepo;
import com.geekster.Food.Delivery.Platform.API.repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    IOrderRepo orderRepo;

    @Autowired
    IUserRepo userRepo;

    @Autowired
    IFoodItemRepo foodItemRepo;

    @Autowired
    AuthenticationService authenticationService;

    public List<Order> getAllOrders() {
       return orderRepo.findAll();
    }

    public String createOrder(AuthenticationInput authInfo, Order newOrder) {
        if (authenticationService.authenticate(authInfo)) {
            User user = userRepo.findByUserId(newOrder.getUser().getUserId());
            newOrder.setUser(user);
            FoodItem foodItem = foodItemRepo.findByFoodItemId(newOrder.getFoodItem().getFoodItemId());
            newOrder.setFoodItem(foodItem);
            orderRepo.save(newOrder);
            return "new order created";
        }
        else {
            return "authentication required";
        }
    }

    public String cancelOrderById(Long id) {
        orderRepo.deleteById(id);
        return "order cancelled successfully";
    }
}
