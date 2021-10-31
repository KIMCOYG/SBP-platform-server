package com.example.promotionplatform.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class Shops {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String tel;

    private String register_number;

    private String start_time;

    private String end_time;

    private String holiday;

    private String shop_content;

    private String zonecode;

    private String basic_address;

    private String road_address;

    private String detail_address;

    private BigDecimal latitude;

    private BigDecimal longitude;

    private LocalDateTime created_datetime;

    private LocalDateTime updated_datetime;

    private LocalDateTime removed_datetime;

    private Integer enabled;
}
