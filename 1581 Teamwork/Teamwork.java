import java.util.Scanner;

public class Teamwork {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int items = input.nextInt();
		
		int[] values = new int[items];
		
		for (int i = 0; i < items; i++)
		{
			values[i] = input.nextInt();
		}
		
		input.close();
		String compressedNumbers = compress(values);
		
		System.out.println(compressedNumbers);
	}
	
	
	public static String compress(int[] n)
	{
		StringBuffer buff = new StringBuffer();
		int counter = 0;
		
		int temp;
		int tempCount;
		while (counter < n.length)
		{
			temp = n[counter];
			tempCount = 1;
			counter++;
			
			while ( (counter) < n.length && temp == n[counter])
			{
				counter++;
				tempCount++;
			}
			
			buff.append(tempCount + " " + temp + " ");
				
		}
		
		return buff.toString();
	}
}
