package com.bridgelabz;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int year;
System.out.println("Enter a year:");
Scanner sc=new Scanner(System.in);
year=sc.nextInt();
if(((year%4==0)&&(year%100!=0))||(year%400==0)) {
	System.out.println("Specified year is leap year");
}else {
		System.out.println("Not leap year");
}
	}

}
