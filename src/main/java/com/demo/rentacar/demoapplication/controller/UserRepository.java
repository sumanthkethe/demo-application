package com.demo.rentacar.demoapplication.controller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
	User findUserByname(String user_name);
}
