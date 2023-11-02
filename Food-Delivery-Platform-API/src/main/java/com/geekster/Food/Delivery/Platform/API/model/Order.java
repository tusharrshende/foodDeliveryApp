package com.geekster.Food.Delivery.Platform.API.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

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

    @Enumerated(EnumType.STRING)
    private Status orderStatus;


    @OneToMany
    @JoinColumn(name = "fk_orderId")
    private List<FoodItem> foodItem;


    @OneToOne
    @JoinColumn(name = "fk_userId")
    private User user;
}
