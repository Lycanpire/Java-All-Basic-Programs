package com.assignment.july26;

import java.util.Scanner;

public class DiagonalArray {
	public static void main(String[] args) {
		int i,j,m,n;
    int arr[][]= new int[10][10];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the dimension of array m*n");
    m=sc.nextInt();
	n=sc.nextInt();
	System.out.println("Enter the elements in array");
	for(i=0;i<m;i++) 
	{for(j=0;j<n;j++){
		arr[i][j]=sc.nextInt();
	}}
	for(i=0;i<m;i++) 
	{for(j=0;j<n;j++){
		if(i==j|| i+j==n-1 ) {
			System.out.print(arr[i][j]+ " ");
				}
		else
			System.out.print(" ");
				}
//	
	
	System.out.println();
	}
	}
}
