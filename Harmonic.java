
import java.util.Scanner;
public class Harmonic{
	public static void main(String[] args){
		int num,i;
		double value = 0;
	Scanner in=new Scanner(System.in);
		System.out.println("Please Enter N");
		num = in.nextInt();
		//Giving precondition if number is zero
		if(num==0){
			System.out.println("Value of N can not be zero");
		}
		//finding the value
		else{
			for(i=1;i<=num;i++){
				value = value + (1.0f/i);
			}
			System.out.println("Harmonic value of "+num+" is "+value);
		}

	}
}
