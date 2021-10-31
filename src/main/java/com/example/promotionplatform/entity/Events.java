package com.example.promotionplatform.entity;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class Events {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDateTime start_datetime;

    private LocalDateTime end_datetime;

    private String event_content;

    private LocalDateTime created_datetime;

    private LocalDateTime updated_datetime;

    private LocalDateTime removed_datetime;

    private Integer enabled;
}
