package com.libertymutual.goforcode.invoicify;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import com.libertymutual.goforcode.invoicify.models.FlatFeeBillingRecord;

public class FlatFeeBillingRecordTests {

    @Test
    public void test_the_getTotal_returns_the_total_amount() {
        //Arrange
        FlatFeeBillingRecord record = new FlatFeeBillingRecord();
        record.setAmount(11L);
        
        //Act
        double amount = record.getTotal();
        
        //Assert
        assertThat(amount).isEqualTo(11L);
    }
	
}
