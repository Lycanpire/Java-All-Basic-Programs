package com.assignment.july26;

import java.util.Scanner;

public class ArrayElementReverse {

	public static void main(String[] args) {
		int n,i,temp;
		int arr[]= new  int[20];
		int rev[]= new  int[20];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The no. of elements you want to enter");
		n=sc.nextInt();
		System.out.println("Enter the elements in array");
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			rev[i]=0;
		}
	
		for(i=0;i<n;i++) {
			while(arr[i]>0) {
			temp=arr[i]%10;
			rev[i]=(rev[i]*10)+temp;
			arr[i]=arr[i]/10;
			}
		}
		for(i=0;i<n;i++) {
			System.out.println(rev[i]+" ");
			
		}
	}

}
