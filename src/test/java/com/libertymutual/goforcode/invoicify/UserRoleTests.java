package com.libertymutual.goforcode.invoicify;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;
import org.meanbean.test.BeanTester;

import com.libertymutual.goforcode.invoicify.models.UserRole;

public class UserRoleTests {

	@Test
    public void test_all_getters_and_setters_for_UserRole_tests() {
         BeanTester tester = new BeanTester();
          tester.testBean(UserRole.class);
	}

}
