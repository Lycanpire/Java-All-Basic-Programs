package com.assignment.july26;
import java.util.Scanner;

public class OddAndEven {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A number");
		n=s.nextInt();
		
		if((n%2)==0) {
			System.out.println("Number is even");
		}
		else
			System.out.println("number is odd");
	}

}
