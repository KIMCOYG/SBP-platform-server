package com.example.promotionplatform.repository;

import com.example.promotionplatform.entity.Users;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;

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
        Optional<Users> user = usersRepository.findById(1L);

        user.ifPresent(u -> {
            System.out.println(u);
        });
    }

    @Test
    public void update() {
        Optional<Users> user = usersRepository.findById(1L);

        user.ifPresent(u -> {
            u.setRole(1);
            u.setUpdated_datetime(LocalDateTime.now());

            Users updatedUser = usersRepository.save(u);
            System.out.println(updatedUser);
        });
    }

    @Test
    @Transactional
    public void delete() {
        Optional<Users> user = usersRepository.findById(1L);

        Assertions.assertTrue(user.isPresent());

        user.ifPresent(select -> {
            usersRepository.delete(select);
//            System.out.println("delete 실행");
        });

        Optional<Users> deleteUser = usersRepository.findById(1L);
        if (deleteUser.isPresent()) {
            System.out.println("데이터 존재: " + deleteUser.get());
        } else {
            System.out.println("데이터 삭제 완료");
        }
    }
}