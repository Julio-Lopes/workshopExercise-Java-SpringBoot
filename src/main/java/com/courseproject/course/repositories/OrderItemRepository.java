package com.courseproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courseproject.course.entities.OrdemItem;


public interface OrderItemRepository extends JpaRepository<OrdemItem, Long>  {
    
}
