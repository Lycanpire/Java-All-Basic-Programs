package com.assignment.july26;

import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
		int n,temp,rev=0,number;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A number");
		n=s.nextInt();
		number=n;
        while(n>0) {
        	temp=n%10;
        	rev=(rev*10)+temp;
        	n=n/10;
        }
        
        if(rev==number)
        {
        	System.out.println("Number is palindrome");
        }
        else
        {
        	System.out.println("Not A palindrome");
        }
	}

}
