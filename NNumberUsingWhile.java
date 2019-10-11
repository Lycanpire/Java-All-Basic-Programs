package com.assignment.july26;

import java.util.Scanner;

public class NNumberUsingWhile {
	public static void main(String[] args) {
	int n,i=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Print the number till where you want to print the number");
	n=s.nextInt();
	while(i<=n) {
		System.out.println(i+" ");
	 i++;
	}

	}

}