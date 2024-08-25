package com.example.travel_blog_java.repository;

import com.example.travel_blog_java.entities.Tags;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface TagsRepository extends JpaRepository<Tags, Long>{
//

}
