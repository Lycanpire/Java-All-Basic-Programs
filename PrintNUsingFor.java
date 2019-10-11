package com.assignment.july26;

import java.util.Scanner;

public class PrintNUsingFor {

	public static void main(String[] args) {
	int n;
	Scanner s=new Scanner(System.in);
	System.out.println("Print the number till where you want to print the number");
	n=s.nextInt();
	for(int i=0;i<=n;i++) {
		System.out.println(i+" ");
	}

	}

}
