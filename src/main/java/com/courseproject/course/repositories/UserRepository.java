package com.courseproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courseproject.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>  {
    
}
