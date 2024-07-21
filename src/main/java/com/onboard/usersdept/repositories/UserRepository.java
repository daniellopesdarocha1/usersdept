package com.onboard.usersdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onboard.usersdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
