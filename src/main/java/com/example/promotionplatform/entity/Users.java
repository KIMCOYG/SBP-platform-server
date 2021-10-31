package com.example.promotionplatform.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String password;

    private String name;

    private String phone;

    private Integer role;

    private LocalDateTime created_datetime;

    private LocalDateTime updated_datetime;

    private LocalDateTime removed_datetime;

    private Integer enabled;
}
