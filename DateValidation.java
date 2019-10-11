package com.assignment.july26;

import java.util.Scanner;

public class DateValidation {

	public static void main(String[] args) {
		int mm,dd,yyyy,n;
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the date dd,mm,yy");
			dd=s.nextInt();
			mm=s.nextInt();
			yyyy=s.nextInt();
			if(mm==2)
			{if(yyyy%4==0);
			    n=29;
				System.out.println("Leap year");
			}
			else
			{ n=28;
				
			}	
			switch(mm)
			{		case 1:case 3: case 5: case 7 :case 8:case 10:case 12: n=31;
			break;
			case 9:case 4:case 6:case 11: n=30;
			break;
			default : System.out.println("Not a Valid Date");
	}
			if((dd>0) && (dd<31))
			{
				System.out.println("Date is valid");
			}
			else
			{
               System.out.println("Date is Invalid");
			}
					
		

	}

}
