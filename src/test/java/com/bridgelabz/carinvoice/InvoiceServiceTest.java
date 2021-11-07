package com.bridgelabz.carinvoice;

import org.junit.Assert;
import org.junit.Test;

public class InvoiceServiceTest {

	@Test
	public void givenDistanceAndTimeShouldReturnTotalFare() {
		InvoiceService invoiceservice = new InvoiceService();

		double distance = 2.0;
		int time = 5;

		double fare = invoiceservice.calculateFare(distance, time);
		Assert.assertEquals(25, fare, 0);
	}
}