import java.io.*;
import java.util.Scanner;
class LeapYear
{
	public static void main(String ar[])
	{
		int year=0;
		Scanner in=new Scanner((System.in));
		System.out.println("Please Enter year U want to check it is leap or not!");
			try
			{
			 	year =in.nextInt();
			}catch(Exception e)
			{	
				System.out.print(e);
			}
			
			if(year%4==0 && year%100!=0 || year%400==0)
			{
				System.out.println("Given Year is Leap Year :"+year);
			}
			else
			{
				System.out.println("Given Year is Century Year :"+year);
			}

	}
}		
			
