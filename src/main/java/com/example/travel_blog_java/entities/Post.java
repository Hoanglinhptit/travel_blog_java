package com.example.travel_blog_java.entities;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
enum Status {
pending,
approved,
    cancel
}
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDateTime postedAt = LocalDateTime.now();

    private String title;

    @Lob
    private String content;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private Users author;

    @OneToMany(mappedBy = "post")
    private List<Tags> tags;

    @OneToMany(mappedBy = "post")
    private List<Category> categories;

    private LocalDateTime createdAt = LocalDateTime.now();

    private LocalDateTime updatedAt;

    @Enumerated(EnumType.STRING)
    private Status status = Status.pending;

    @Column(nullable = false)
    private Integer views = 1;

    // Constructors, getters, and setters

    @PreUpdate
    public void preUpdate() {
        // Increment views before update
        this.views++;
    }
}
