/*
*@file_Name: Palindrome.java
*@Author:sharad 
*@Date: 28-09-2016
*@purpose: Program for checking Palindrome String by String reversing.
*/

import java.util.Scanner;

class Palindrome{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String string,reverse = "";
		int size;
		System.out.println("Please Enter a string:");
		string =in.next();
		size = string.length();

		//reversing the string
		for(int i=size-1;i>=0;i--){
			reverse = reverse + string.charAt(i);
		}

		System.out.println("Reversed String is :"+reverse);

		//checking for palindrome
		if(string.equals(reverse))
			System.out.println("Given String is Palindrome");
		else
			System.out.println("Given String is not Palindrome");	

	}
}
