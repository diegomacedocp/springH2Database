package com.diegomacedo.H2Database.com.diegomacedo.springTokenRefresh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diegomacedo.H2Database.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);
}
