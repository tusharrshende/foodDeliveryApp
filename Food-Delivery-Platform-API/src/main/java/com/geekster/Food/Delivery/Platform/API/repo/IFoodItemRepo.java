package com.geekster.Food.Delivery.Platform.API.repo;

import com.geekster.Food.Delivery.Platform.API.model.Category;
import com.geekster.Food.Delivery.Platform.API.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IFoodItemRepo extends JpaRepository<FoodItem, Long> {

    FoodItem findByFoodItemId(Long foodItemId);
}
