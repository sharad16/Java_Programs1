import java.util.Scanner;

public class StockInput{
		int number;
		double allTotal = 0;
		
		Scanner in = new Scanner(System.in);
		String name[] = new String[100];
		int share[] = new int[100];
		double value[] = new double[100];
		double total[] = new double[100];
		
		//for entry of stock details
		public void entry(int number){
			this.number = number;
			for(int i=0;i<number;i++){
				System.out.println("\nPlease Enter Details for Stock: "+(i+1));
				System.out.println("Name:");
				name[i] = in.next();
				System.out.println("No. of shares:");
				share[i] = in.nextInt();
				System.out.println("Value for Each share:");
				value[i] = in.nextDouble();		
			}
			
		}

		//calculating total of each stack
		public void calculate(){
			for(int i=0;i<number;i++){
				total[i] = share[i]*value[i];
				System.out.println("Total value for Stock "+(i+1)+" is: "+total[i]+" Rs.");
			}
		}

		//Calculating total share
		public void totalval(){
			for(int i=0;i<number;i++){
				allTotal = allTotal+total[i];
			}
			System.out.println("\nTotal value of all "+number+" Stock is: "+allTotal+" Rs.");
		}
	


}
