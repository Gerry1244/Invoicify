package com.libertymutual.goforcode.invoicify;


import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.meanbean.test.BeanTester;

import com.libertymutual.goforcode.invoicify.models.User;



public class UserTests {
	User user;
	
	@Before
	public void setUp() { 
		user = new User();
	}
	
	  @Test
	    public void test_constructor_for_user() {        
	        user = new User("gerry","gerry", "ADMIN");
	        assertThat("gerry").isEqualTo(user.getUsername());
	        assertThat("gerry").isEqualTo(user.getPassword());
	        assertThat(user.getRoles().contains("ADMIN"));
	    }
	  
		@Test
	    public void test_all_getters_and_setters() {
	         BeanTester tester = new BeanTester();
	          tester.testBean(User.class);
		}

	@Test
	public void test_getid_and_setid() {
		// arrange
		user.setId(22L);

		// Act
		Long actual = user.getId();

		// Assert
		assertThat(user.getId()).isEqualTo(22L);
	}
	
	@Test
	public void test_getpassword_and_setpassword() {
		// arrange
		user.setPassword("caesar");
			// Act
		String actual = user.getPassword();
		//Assert
		assertThat(user.getPassword()).isEqualTo("caesar");
		
	}
	
	@Test
	public void test_that_is_AccountNonExpired_returns_true() {
        User user = new User();
        boolean AccountNonExpired = user.isAccountNonExpired();
        assertThat(AccountNonExpired).isTrue();
	
	}
	@Test
	public void test_that_is_AccountNonLocked_returns_true() {
        User user = new User();
        boolean AccountNonLocked = user.isAccountNonLocked();
        assertThat(AccountNonLocked).isTrue();
	
	}
	
	@Test
	public void test_that_is_enabled_returns_true() {
        User user = new User();
        boolean enabled = user.isEnabled();
        assertThat(enabled).isTrue();
	
	}
	
	@Test
	public void test_that_is_CredentialsNonExpired_returns_true() {
        User user = new User();
        boolean CredentialsNonExpired = user.isCredentialsNonExpired();
        assertThat(CredentialsNonExpired).isTrue();
	
	}
}