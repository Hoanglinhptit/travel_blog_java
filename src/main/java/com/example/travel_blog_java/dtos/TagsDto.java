package com.example.travel_blog_java.dtos;

import com.example.travel_blog_java.entities.Post;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * DTO for {@link com.example.travel_blog_java.entities.Tags}
 */

@Data
@Value
@Getter
@Setter
@AllArgsConstructor
public class TagsDto implements Serializable {
    Integer id;
    String name;
    List<PostDto> posts;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
}