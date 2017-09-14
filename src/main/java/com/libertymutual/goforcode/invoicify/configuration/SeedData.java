package com.libertymutual.goforcode.invoicify.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.libertymutual.goforcode.invoicify.Repositories.UserRepository;
import com.libertymutual.goforcode.invoicify.models.User;

@Configuration
@Profile("development")


public class SeedData {
	
	public SeedData(UserRepository usersRepository, PasswordEncoder encoder)  {
		usersRepository.save(new User("gerry", encoder.encode("gerry"), "ADMIN"));
		usersRepository.save(new User("admin", encoder.encode("admin"), "ADMIN"));
		usersRepository.save(new User("clerk", encoder.encode("clerk"), "CLERK"));
		usersRepository.save(new User("accountant", encoder.encode("accountant"), "ACOUNTANT"));
	}

	
}