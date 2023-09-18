package com.pedrohenrique.userdepartment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrohenrique.userdepartment.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
