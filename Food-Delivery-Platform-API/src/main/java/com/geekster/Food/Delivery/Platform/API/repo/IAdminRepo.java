package com.geekster.Food.Delivery.Platform.API.repo;

import com.geekster.Food.Delivery.Platform.API.model.Admin;
import com.geekster.Food.Delivery.Platform.API.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdminRepo extends JpaRepository<Admin,Long> {
    Admin findFirstByAdminEmail(String email);
}
