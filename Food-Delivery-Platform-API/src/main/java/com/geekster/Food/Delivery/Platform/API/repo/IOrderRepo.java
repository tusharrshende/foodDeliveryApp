package com.geekster.Food.Delivery.Platform.API.repo;

import com.geekster.Food.Delivery.Platform.API.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepo extends JpaRepository<Order,Long> {
}
