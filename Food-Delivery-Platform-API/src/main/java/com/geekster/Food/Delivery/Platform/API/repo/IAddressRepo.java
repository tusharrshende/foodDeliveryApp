package com.geekster.Food.Delivery.Platform.API.repo;

import com.geekster.Food.Delivery.Platform.API.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends JpaRepository<Address,Long> {
}
