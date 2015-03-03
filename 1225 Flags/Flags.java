import java.util.Scanner;

public class Flags {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int numStripes = input.nextInt();
		
		input.close();
		
		long numChoice = giveChoice((long)(numStripes - 1));
	
		System.out.print(numChoice + " ");
	}
	
	public static long giveChoice(long numStripes)
	{		
		
		long a = 2;
		long b = 4;
		
		if (numStripes == 1 || numStripes == 0)
			return a;
		else if (numStripes == 2)
			return b;
		
		for (int i = 1; i < numStripes - 1; i++)
		{
			long temp = a;
			a = b;
			b = temp+b;
		}
		
		return b;
	}
}
