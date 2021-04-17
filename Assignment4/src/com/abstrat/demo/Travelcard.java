package com.abstrat.demo;

public class Travelcard extends PrepaidCard {
	private double rewardPoint;
	private int count;
	private double calculateRewardPoint(double amount) {
		double count = amount / 100;
		rewardPoint = count * 5;
		return rewardPoint;
	}

	@Override
	boolean swipeCard(double amount) {
		count++;
		double INR = amount * 60;
		double charges = (INR * 5) / 100;
		INR = INR + charges;
		double balance = getAvailableBalance();
		if ( balance> INR && count<= getSwipeLimit() ) {
			balance = balance - INR;
			System.out.println("Withdraw amount " + INR + " and Charges " + charges);
			calculateRewardPoint(INR);
			setAvailableBalance(balance);
			return true;
		}
		return false;
	}

}