package com.assignment.july26;

import java.util.Scanner;

public class CheckVowel {	public static void main(String[] args) {
	char c;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter A character");
	c=s.next().charAt(0);
	switch(c) {
	case 'a': case 'i':case 'o':case 'u':case 'e':
		System.out.println("It is a vowel");
		break;
	default:
		System.out.println("not a vowel");
          break;
	}
	
}
}
