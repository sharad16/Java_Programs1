/*
*@file_Name: StringReplace.java
*@Author:Sharad Vanjari
*@Date: 28-09-2016
*@purpose: program for finding imagine Number"
*/

import java.util.Scanner;
public class FindNo{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Please Enter No. of Steps you want");
		int steps = in.nextInt();
		int result = 1,N;
		boolean check;
		for(int i=0;i<steps;i++){
			result = result*2;
		}

		//Asking the user to imagine a number
		N = result;
		System.out.println("Imagine the no. between 0 to "+(N-1));
		int first = 1;
		int last = N/2;
		int i=2,j=4;

		//Cheaking the numbers
		for(int k=1;k<steps;k++){
			System.out.println("Is Your no Present Between "+(first-1)+" to "+(last-1)+"??\ntrue or false");
			check = in.nextBoolean();
			if(check){
				N = N/2;
				last = last-((last-first+1)/2);
			}
			else{
				first = first+N/i;
				last = last+N/j;
				i = i+i;
				j = j+j;
			}
		}
		//final check between 2 numbers and printing Answer
		System.out.println("Is Your no is "+(first-1)+"?? \ntrue or false");
		check = in.nextBoolean();
		if(check)
			System.out.println("Answer is: "+(first-1));
		else
			System.out.println("Answer is: "+(last));
	}
}
