package com.example.travel_blog_java.entities;
import jakarta.persistence.*;
import java.util.List;
import java.time.LocalDateTime;
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "category")
    private List<Post> posts;

    private LocalDateTime createdAt = LocalDateTime.now();

    private LocalDateTime updatedAt;
    //
}
