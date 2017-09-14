package com.libertymutual.goforcode.invoicify;


import static org.assertj.core.api.Assertions.*;


import org.junit.Test;
import org.meanbean.test.BeanTester;

import com.libertymutual.goforcode.invoicify.models.RateBasedBillingRecord;
import com.libertymutual.goforcode.invoicify.models.User;


public class RateBasedBillingRecordTests { 
	
	@Test
    public void test_all_getters_and_setters() {
         BeanTester tester = new BeanTester();
          tester.testBean(RateBasedBillingRecord.class);
	}
	
	@Test
	public void test_getTotal_returns_the_total_amount() {
	//Arrange
		RateBasedBillingRecord record = new RateBasedBillingRecord();
		record.setRate(5);
		record.setQuantity(3);
		
		//Act
		double amount = record.getTotal();
		
		//Assert
		assertThat(amount).isEqualTo(15); 
		
		
		
	}
	
	
	
}
































	