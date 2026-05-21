package com.jobquest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobquest.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}