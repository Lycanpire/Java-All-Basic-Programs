package com.assignment.july26;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
			int a,b,c=0;
			char sign;
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the numbers a and b");
			a=s.nextInt();
			b=s.nextInt();
			System.out.println("Enter the computation u wanna do +,-,*,/");
			sign=s.next().charAt(0);
			switch(sign) {
			case '+':c=a+b;
			break;
			case '-':c=a-b;
			break;
			case '*':c=a*b;
			break;
			case '/':c=a/b;
			break;
			default :System.out.println("Invalid Input");
			
			}
			System.out.println("The Result is "+ c);

	}

}
