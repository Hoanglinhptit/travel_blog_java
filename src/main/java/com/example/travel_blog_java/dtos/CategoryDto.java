package com.example.travel_blog_java.dtos;

import com.example.travel_blog_java.entities.Post;
import lombok.Data;
import lombok.Value;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * DTO for {@link com.example.travel_blog_java.entities.Category}
 */
@Data
@Value
public class CategoryDto implements Serializable {
    Integer id;
    String name;
    List<Post> posts;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
}