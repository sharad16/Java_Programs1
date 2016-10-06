
/*
*@file_Name: PrimeFactor.java
*@Author:Sharad Vanjari
*@Date: 28-09-2016
*@purpose: program for finding prime factors"
*/

import java.util.Scanner;

public class PrimeFactor{
	public static void main(String[] args){
		int number;
		Scanner in=new Scanner(System.in);
		System.out.println("Please Enter a number");
		number =in.nextInt(); 
		System.out.print("Prime factors of numbers are: ");
		
		
		for(int i=2;i<=number;i++){
			while(number%i == 0){
				number = number/i;
				System.out.print(i+" ");
			}
		}

		System.out.println();
	} 
}
