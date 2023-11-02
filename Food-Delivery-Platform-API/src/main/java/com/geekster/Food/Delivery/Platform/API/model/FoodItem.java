package com.geekster.Food.Delivery.Platform.API.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class FoodItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long foodItemId;

    private String foodItemName;

    private Double foodItemPrice;

    @Enumerated(EnumType.STRING)
    private Category foodItemCategory;


    @ManyToOne
    @JoinColumn(name = "fk_adminId")
    private Admin admin;
}
