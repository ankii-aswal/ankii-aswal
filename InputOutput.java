import java.util.Scanner;
public class Io
{
	public static void main(String [] args)
	{
		System.out.println("Enter the value of k\n(k=1 for normal soil, k=1.2 for stony soil, k=0.8 f0r clayey soil");
		Scanner constant=new Scanner(System.in);
		double soilConst=constant.nextDouble();
		System.out.println("Enter the production of seeds/tree (in kg)");
		Scanner input=new Scanner(System.in);
		int seed=input.nextInt();
		double y;
		
		if(soilConst==1)
		{
		y=943.5*seed;
		System.out.println("\nOutput Energy in the particular year with " + seed+"kg seed is : "+y);
		}
		
		else if(soilConst==1.2)
		{
		y=1132.2*seed;
		System.out.println("\nOutput Energy in the particular year with " + seed+"kg seed is : "+y);
		}
		
		else if(soilConst==0.8)
		{
		y=801.975*seed;
		System.out.println("\nOutput Energy in the particular year with " + seed+"kg seed is : "+y+"MJ");
		}
	}
}



   

