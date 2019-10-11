package com.assignment.july26;

import java.util.Scanner;

public class CalculateGrade {
	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Percentage");
		n=s.nextInt();
	    if(n>=75)
	    {System.out.println("Grade A");
	    
	    }
	    else if(n>=60)
 {System.out.println("Grade B");
	    
	    }
	    else if(n>40)
 {System.out.println("Grade C");
	    
	    }
	    else if(n>33)
 {System.out.println("Grade D");
	    
	    }
	    else
 {System.out.println("Fail");
	    
	    }
	    	
	
	
	
	}
	
}
