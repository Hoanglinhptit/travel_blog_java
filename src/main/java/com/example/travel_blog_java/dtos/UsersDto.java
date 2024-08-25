package com.example.travel_blog_java.dtos;

import com.example.travel_blog_java.entities.Users;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.Value;

import java.io.Serializable;
import java.util.List;

/**
 * DTO for {@link Users}
 */
@Data
@Value
public class UsersDto implements Serializable {
    Integer id;

    @NotEmpty
    String email;
    String name;

    @Transient
    String password;

    @NotEmpty
    String role;

    List<PostDto> posts;
}