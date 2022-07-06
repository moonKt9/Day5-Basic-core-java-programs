package com.bridgelabz;
import java.util.Scanner;
public class PrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the number to find prime factors:");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=1;i<=num/2;i++) {
	if(num%i==0) {
		System.out.println(i+" ");
	}
	
}
System.out.println(num);
	}

}
