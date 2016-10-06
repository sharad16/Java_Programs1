/*
*@file_Name: stockReport.java
*@Author:Sharad Vanjari
*@Date: 28-09-2016
*@purpose: program for calculating total shares and printing total cost of each share"
*/

import java.util.Scanner;

public class StockReport{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		StockInput si = new StockInput();
		int stockNumber;
		System.out.println("Please Enter No. of Stocks: ");
		stockNumber = in.nextInt();
		
		si.entry(stockNumber);
		si.calculate();
		si.totalval();
	}
}
