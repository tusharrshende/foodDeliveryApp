package com.geekster.Food.Delivery.Platform.API.service;

import com.geekster.Food.Delivery.Platform.API.model.Address;
import com.geekster.Food.Delivery.Platform.API.model.authModel.AuthenticationInput;
import com.geekster.Food.Delivery.Platform.API.repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    IAddressRepo addressRepo;

    @Autowired
    AuthenticationService authenticationService;

    public String createAddress(AuthenticationInput authInfo,Address newAddress) {
          if(authenticationService.authenticate(authInfo)) {
              Address address = new Address();
              address.setArea(newAddress.getArea());
              address.setCity(newAddress.getCity());
              address.setState(newAddress.getState());
              address.setCountry(newAddress.getCountry());
              address.setPinCode(newAddress.getPinCode());
              address.setUser(newAddress.getUser());
              addressRepo.save(address);
              return "address added successfully";
          } else {
              return "authentication required";
          }
    }
}
