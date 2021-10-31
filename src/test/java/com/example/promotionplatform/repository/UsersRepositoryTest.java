package com.example.promotionplatform.repository;

import com.example.promotionplatform.entity.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UsersRepositoryTest {
    @Autowired
    private UsersRepository usersRepository;

    @Test
    public void create() {
        Users user = new Users();
        user.setEmail("kjhkjh9753@naver.com");
        user.setEnabled(1);
        user.setPassword("123123");
        user.setPhone("01075492337");
        user.setRole(0);
        user.setName("KIMCOYG");
        user.setCreated_datetime(LocalDateTime.now());

        Users newUser = usersRepository.save(user);
        System.out.println(newUser);
    }

    @Test
    public void read() {

    }
}