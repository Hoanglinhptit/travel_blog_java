package com.example.travel_blog_java.repository;

import com.example.travel_blog_java.entities.Post;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
//
}
