package com.example.travel_blog_java.services.internal;

import com.example.travel_blog_java.entities.Users;
import com.example.travel_blog_java.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Optional;

@Service
public class UserServices implements UserDetailsService {
    @Autowired
    private UsersRepository usersRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Users user = usersRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with email: " + email));

        return new User(
                user.getEmail(),
                user.getPassword(),
                Collections.singleton(() -> "ROLE_" + user.getRole()) // Cấp quyền cho người dùng
        );
    }

    public Users saveUser(Users user) {
        return usersRepository.save(user);
    }

    public Optional<Users> findByEmail(String email) {
        return usersRepository.findByEmail(email);
    }
}
