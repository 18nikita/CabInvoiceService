package com.bridgelabz.carinvoice;

public class InvoiceService {
	private static final double MIN_COST_PER_KM = 10.00;
	private static final double COST_PER_TIME = 1.00;
	private static final double MIN_FARE = 5.00;

	public double calculateFare(double distance, int time) {
		double totalFare = ((distance * MIN_COST_PER_KM) + (time * COST_PER_TIME));
		return Math.max(totalFare, MIN_FARE);

	}
}
