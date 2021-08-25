package com.diegomacedo.H2Database;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

import com.diegomacedo.H2Database.domain.Role;
import com.diegomacedo.H2Database.domain.User;
import com.diegomacedo.H2Database.service.UserService;

@Configuration
public class H2DatabaseRunner implements ApplicationRunner {

	@Autowired
	private UserService userSerice;
	
	@Override
	public void run(ApplicationArguments applicationArguments) throws Exception {
		userSerice.saveRole(new Role(null,"ROLE_USER"));
		userSerice.saveRole(new Role(null,"ROLE_MANAGER"));
		userSerice.saveRole(new Role(null,"ROLE_ADMIN"));
		userSerice.saveRole(new Role(null,"ROLE_SUPER_ADMIN"));
		
		userSerice.saveUser(new User(null,"Diego Macedo","diegomacedo","12345", new ArrayList<>()));
		userSerice.saveUser(new User(null,"Will Smih","will","12345", new ArrayList<>()));
		userSerice.saveUser(new User(null,"Jim Carry","jim","12345", new ArrayList<>()));
		userSerice.saveUser(new User(null,"Arnold Schwarzenegger","arnold","12345", new ArrayList<>()));
		
		userSerice.addRoleToUser("diegomacedo", "ROLE_ADMIN");
		userSerice.addRoleToUser("diegomacedo", "ROLE_USER");
		userSerice.addRoleToUser("diegomacedo", "ROLE_SUPER_ADMIN");
		
		userSerice.addRoleToUser("will", "ROLE_USER");
		userSerice.addRoleToUser("will", "ROLE_MANAGER");
		userSerice.addRoleToUser("jim", "ROLE_MANAGER");
		userSerice.addRoleToUser("arnold", "ROLE_ADMIN");
	}
}
