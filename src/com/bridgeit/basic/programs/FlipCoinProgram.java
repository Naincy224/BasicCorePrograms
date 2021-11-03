package com.bridgeit.basic.programs;

public class FlipCoinProgram {
	
	
	public static void main(String[] args) {
		double headCount=0;
		double tailCount=0;
		int totalRun=100;
		double headPercent;
		double tailPercent;
		for (int i=0;i<totalRun;i++) {
			
			double randomNumber=Math.random();
			
			if(randomNumber<0.5) {
				tailCount++;
			}
			else {
				headCount++;
			}
		}
		System.out.println("Head Count:"+headCount);
		System.out.println("Tail Count:"+tailCount);
		
		headPercent= (headCount/totalRun) * 100.00;
		tailPercent= (tailCount/totalRun) * 100.00;
		System.out.println("Head Percent is:" +headPercent);
		System.out.println("Tail Percent is:" +tailPercent);
		
	}
	

}
