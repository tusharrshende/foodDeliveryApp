package com.geekster.Food.Delivery.Platform.API.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long adminId;

    @NotBlank
    private String adminName;

    @NotBlank
    private String restaurantName;

    @Digits(integer = 10,fraction = 0)
    private String contact;

    @Pattern(regexp = "^.+@restroAdmin\\.com$")
    private String adminEmail;

    @Size(min = 6, max = 20)
    private String adminPassword;

}
