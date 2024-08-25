package com.example.travel_blog_java.repository;

import com.example.travel_blog_java.entities.Category;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{
    List<Category> getCategoriesById(Integer id);

    List<Category> getCategoriesB
//
}
