package com.geekster.Food.Delivery.Platform.API.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;

    private String area;

    private String city;

    private String state;

    private String country;

    private Long pinCode;


    @OneToOne
    @JoinColumn(name = "fk_userId")
    private User user;
}
