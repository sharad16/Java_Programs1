/*
*@file_Name: PowerOf2.java
*@Author:Sharad Vanjari
*@Date: 29-09-2016
*@purpose: Taking command line arguments and finding power of two"
*/

class PowerOf2
{
	public static void main(String ar[])
	{
		int power=Integer.parseInt(ar[0]);// Taking command line arg
		int result=1;
	//logic for finding power of two
		if(power>=0 & power<31){
			for(int i=0;i<=power;i++){
				System.out.println("2^"+i+"="+result);
				result = result*2;
			}
		}
		else
		System.out.println("Give Number between 1 and 30");

	}
}

