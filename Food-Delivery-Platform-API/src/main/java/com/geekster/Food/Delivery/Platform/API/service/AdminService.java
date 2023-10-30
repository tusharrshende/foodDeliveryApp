package com.geekster.Food.Delivery.Platform.API.service;

import com.geekster.Food.Delivery.Platform.API.model.Admin;
import com.geekster.Food.Delivery.Platform.API.repo.IAdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    IAdminRepo adminRepo;

    public String adminSignUp(Admin newAdmin) {
        adminRepo.save(newAdmin);
        return newAdmin.getRestaurantName() + " registered successfully";
    }
}
