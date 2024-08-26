package com.example.travel_blog_java.services;

import com.example.travel_blog_java.dtos.UsersDto;
import com.example.travel_blog_java.entities.Users;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    Users createUser(UsersDto userDTO) throws Exception;
    String login(UsersDto usersDto) throws Exception;
    Users getUserDetailsFromToken(String token) throws Exception;
    Users getUserDetailsFromRefreshToken(String token) throws Exception;
    Users updateUser(Long userId, UsersDto updatedUserDTO) throws Exception;

    Page<Users> findAll(String keyword, Pageable pageable) throws Exception;
    void resetPassword(Long userId, String newPassword)
            throws InvalidPasswordException, DataNotFoundException;
    void blockOrEnable(Long userId, Boolean active) throws DataNotFoundException;
//    void changeProfileImage(Long userId, String imageName) throws Exception;
}
