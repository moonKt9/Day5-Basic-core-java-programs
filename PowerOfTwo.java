package com.bridgelabz;

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= Integer.parseInt(args[0]);
		int i=6; //count from 0 to N
		int powerOfTwo=1; // the i th power of two
		
		//repeat until i equals n
		while (i<=n) {
			System.out.println(i +" " + powerOfTwo); 
			//print out the power of two
			powerOfTwo= 2*powerOfTwo; //double to get the n
					i=i+1;
			
		}

	}


	}


