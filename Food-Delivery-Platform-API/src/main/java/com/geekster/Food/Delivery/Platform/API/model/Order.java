package com.geekster.Food.Delivery.Platform.API.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "foodOrder")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    private LocalDateTime orderDate;
    private Status orderStatus;



    @OneToOne
    @JoinColumn(name = "fk_userId")
    private User user;


    @ManyToOne
    @JoinColumn(name = "food_item_id")
    private FoodItem foodItem;
}
