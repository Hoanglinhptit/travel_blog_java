package com.example.travel_blog_java.dtos;

import lombok.Value;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link com.example.travel_blog_java.entities.Comment}
 */
@Value
public class CommentDto implements Serializable {
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
    Long id;
    PostDto post;
    UsersDto user;
    String content;
}