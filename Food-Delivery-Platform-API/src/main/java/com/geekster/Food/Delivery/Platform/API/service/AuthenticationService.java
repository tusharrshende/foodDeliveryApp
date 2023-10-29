package com.geekster.Food.Delivery.Platform.API.service;

import com.geekster.Food.Delivery.Platform.API.model.AuthenticationToken;
import com.geekster.Food.Delivery.Platform.API.model.authModel.AuthenticationInput;
import com.geekster.Food.Delivery.Platform.API.repo.IAuthenticationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    @Autowired
    IAuthenticationRepo authenticationRepo;

    public void createToken(AuthenticationToken token) {
        authenticationRepo.save(token);
    }

    public boolean authenticate(AuthenticationInput authInfo) {


        //find thr actual token -> get the connected patient -> get its email-> verify with passed email

        AuthenticationToken token =  authenticationRepo.findFirstByTokenValue(authInfo.getTokenValue());
        if(token!=null)
        {
            return token.getUser().getUserEmail().equals(authInfo.getEmail());
        }
        else
        {
            return false;
        }
    }

    public void deleteToken(String tokenValue) {
        AuthenticationToken token =  authenticationRepo.findFirstByTokenValue(tokenValue);
        authenticationRepo.delete(token);
    }
}
