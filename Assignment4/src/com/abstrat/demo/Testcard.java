package com.abstrat.demo;

public class Testcard {
	

	
	       public static void main(String[] args) {
				Travelcard tc=new Travelcard();
				tc.setAvailableBalance(100000);
				tc.setSwipeLimit(3);
				tc.setCardNo(3319427);
				
				tc.swipeCard(20);
			}

		}


