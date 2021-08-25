package com.diegomacedo.H2Database.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diegomacedo.H2Database.domain.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

	Role findByName(String name);
}
