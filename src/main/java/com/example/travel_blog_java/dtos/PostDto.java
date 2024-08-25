package com.example.travel_blog_java.dtos;

import com.example.travel_blog_java.entities.Status;
import lombok.Data;
import lombok.Value;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * DTO for {@link com.example.travel_blog_java.entities.Post}
 */
@Data
@Value
public class PostDto implements Serializable {
    Integer id;
    LocalDateTime postedAt;
    String title;
    String content;
    List<TagsDto> tags;
    UsersDto author;
    List<CategoryDto> categories;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
    Status status;
    Integer views;
}