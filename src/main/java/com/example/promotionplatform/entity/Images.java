package com.example.promotionplatform.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class Images {

    private Long id;

    private String image_name;

    private String image_path;

    private String image_type;

    private LocalDateTime created_datetime;

    private LocalDateTime removed_datetime;

    private Integer enabled;

}
