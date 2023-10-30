package com.geekster.Food.Delivery.Platform.API.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @NotBlank
    private String userName;

    @Digits(integer = 10,fraction = 0)
    private String contact;

    @Email
    private String userEmail;

    @NotBlank
    private String userPassword;


}
