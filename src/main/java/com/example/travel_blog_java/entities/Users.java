package com.example.travel_blog_java.entities;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true)
    private String email;

    private String name;

    private String password;

    private String role = "user";

//    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Post> posts = new ArrayList<>();
//    //
}
