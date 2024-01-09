package com.example.travel_blog_java.repository;

import com.example.travel_blog_java.entities.Category;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer>{
//
}
