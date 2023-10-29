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

    @NotBlank
    private String area;

    @NotBlank
    private String city;

    @NotBlank
    private String state;

    @NotBlank
    private String country;

    @NotBlank
    private Long pinCode;



    @OneToOne
    @JoinColumn(name = "fk_userId")
    private User user;

    @OneToOne
    @JoinColumn(name = "fk_adminId")
    private Admin admin;

}
