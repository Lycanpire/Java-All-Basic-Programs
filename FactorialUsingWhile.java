package com.assignment.july26;

import java.util.Scanner;

public class FactorialUsingWhile {

		public static void main(String[] args) {
			int n,i=1,c=1;
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the number");
			n=s.nextInt();
			while(i<=n) {
				c*=i;
				i++;
			}
			if(c==0)
			{System.out.println("1");
			}
			else
			{
			System.out.println("The Factorial is "+ c);
			}
			}

	}


