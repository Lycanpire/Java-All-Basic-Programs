package com.assignment.july26;



public class SwappingUsingFunction {
	public static void swap(int a,int b) {
		int c;
	c=a;
	a=b;
	b=c;
	System.out.println("Number after swapping are "+a+ " and " +b);
	
	}

	public static void main(String[] args) {
		int a=223,b=976;
		System.out.println("Number before swapping are "+a+ " and " +b);
		swap(a,b);
			
	}

}
