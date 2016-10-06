import java.util.Scanner;
class ArrayPri
{
	// method for printing array
	public static void printRow(Integer[] row) {
        for (Integer i : row) {
            System.out.print(+i);
            System.out.print("\t");
        }
        System.out.println();
    }
	public static void main(String ar[])
	{ 
		Scanner in=new Scanner(System.in);

		System.out.println("Enter the Row of Array:");

	  		int M=in.nextInt();

		System.out.println("Enter the Row of Array:");

			int N=in.nextInt();
			int i,j;

			Integer array1[][]=new Integer[M][N];

		System.out.println("Enter elements of array:");


		for(i=0;i<M;i++)
		{
			for(j=0;j<N;j++)
			{
			array1[i][j]=in.nextInt();
			}
		}
		
	System.out.println("Elements of Array are:");
	
	        for(Integer[] row : array1)//Enhance for loop 
		{
	            printRow(row);//printRow method called
	        }
		
	}
}
	



