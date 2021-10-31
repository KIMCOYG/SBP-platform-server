package com.example.promotionplatform.repository;

import com.example.promotionplatform.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
}
