package com.libertymutual.goforcode.invoicify.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.libertymutual.goforcode.invoicify.Repositories.UserRepository;

@Service
public class InvoicifyUserDetailsService implements UserDetailsService {
	
	private UserRepository userRepository;
	
	public InvoicifyUserDetailsService(UserRepository userRepository) {
		this.userRepository = userRepository;
		
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return userRepository.findByUsername(username);
	}

}
