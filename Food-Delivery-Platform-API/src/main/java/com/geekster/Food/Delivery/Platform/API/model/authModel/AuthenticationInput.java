package com.geekster.Food.Delivery.Platform.API.model.authModel;

import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthenticationInput {

    @Email
    private String email;

    private String tokenValue;
}
