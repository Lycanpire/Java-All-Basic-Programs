package com.assignment.july26;

import java.util.Scanner;

public class PrimeNumber{
	public static void main(String[] args) 
 {
	int n,flag=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The number to check if it is prime");
	n=sc.nextInt();
	if(n==1||n==2)
	{System.out.println("number is prime");
	
	}
	else {
	for(int i=3;i<n-1;i++) {
		
		if(n%i==0)
		{flag=0;
	}
		else {
			flag=1;
		}	
		}
	if(flag==1)
		System.out.println("Number is prime");
	else
		System.out.println("Number is not prime");

	}}}

