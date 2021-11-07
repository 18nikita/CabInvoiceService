package com.bridgelabz.carinvoice;

import org.junit.Assert;
import org.junit.Test;

public class InvoiceServiceTest {

	//test case for calculate fare
	@Test
	public void givenDistanceAndTimeShouldReturnTotalFare() {
		InvoiceService invoiceservice = new InvoiceService();

		double distance = 2.0;
		int time = 5;

		double fare = invoiceservice.calculateFare(distance, time);
		Assert.assertEquals(25, fare, 0);
	}
	
	//test case for multiple ride
	@Test
	public void givenDistanceAndTimeShouldReturnMinFare() {
		InvoiceService invoiceservice = new InvoiceService();

		double distance = 0.1;
		int time = 1;

		double fare = invoiceservice.calculateFare(distance, time);
		Assert.assertEquals(5, fare, 0);
	}
}