package com.hanyanginpack.hanyanginpack.box;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity
@Getter
@Table(name = "box")
//@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Box {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String name;

    @Column(length = 100)
    private String category;

    @Column(length = 300)
    private String imagePath;

    @Column(length = 100)
    private String client;

    @Column
    private LocalDateTime createDate;

    @Column(columnDefinition = "TEXT")
    private String description;

    public Box() {
    }

    public Box(String name, String imagePath) {
        this.name = name;
        this.imagePath = imagePath;
        this.createDate = LocalDateTime.now();
        this.category = "default";
    }

    public Box(String name, String category, String imagePath, String client, String description) {
        this.name = name;
        this.category = category;
        this.imagePath = imagePath;
        this.client = client;
        this.createDate = LocalDateTime.now();
        this.description = description;
    }
}
