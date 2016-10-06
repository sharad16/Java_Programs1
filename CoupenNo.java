

import java.util.Scanner;

import java.util.Random;

public class CoupenNo
{

		static Scanner in= new Scanner(System.in);
  		static int N;

		static void randomNo(int num)
		{
		
 			Random r = new Random();
		
		System.out.println("Enter highest Range of Random Number");

		 N=in.nextInt();

		System.out.println("Random Number are:");

		for(int i=1;i<=num;i++)
		{
			System.out.println(r.nextInt(N));
		}
	}

	public static void main(String[] args)
	
	{
		int num;
		
	System.out.println("Please Enter the number of random numbers you want");
		num = in.nextInt();
		randomNo(num);		
	}
}
 
