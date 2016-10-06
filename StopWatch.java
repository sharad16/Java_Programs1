
import java.util.Scanner;
public class StopWatch{
	long StartTime = 0,StopTime = 0, Elapsed = 0;
	//Starting the watch
	public void start(){
		StartTime = System.currentTimeMillis();
	}
	//Stopping
	public void stop(){
		StopTime = System.currentTimeMillis();
	}
	//Calculating Elapsed time
	public long getElapsedTime(){
		Elapsed = (StopTime - StartTime);
		return Elapsed;
	}

	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int startChoice,stopChoice;
		StopWatch w = new StopWatch();
		System.out.println("Please Choose your option:\n1. Start\n2. Stop");
		startChoice = in.nextInt();
		w.start();
		System.out.println("Time is Started\nPlease Enter 2 for Stopping the clock: ");
		stopChoice = in.nextInt();
		w.stop();
		System.out.println("Elapsed Time-: "+w.getElapsedTime()+" mili Seconds");
	
	}
}
