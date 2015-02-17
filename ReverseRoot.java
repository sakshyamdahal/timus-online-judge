/*
	Problem: 1001 ReverseRoot

	Input
	The input stream contains a set of integer numbers Ai (0 ≤ Ai ≤ 1018). 
	The numbers are separated by any number of spaces and line breaks. 
	A size of the input stream does not exceed 256 KB.

	Output
	For each number Ai from the last one till the first one you 
	should output its square root. Each square root should be printed in a 
	separate line with at least four digits after decimal point.	
*/

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseRoot {

	public static void main(String[] args)
	{
		reverseRoot();
	}
	
	public static void reverseRoot()
	{
		Scanner input = new Scanner(System.in);
		ArrayList<Long> numbers = new ArrayList<Long>();
		
		while(input.hasNext())
		{
			numbers.add(Long.valueOf(input.next()));
		}

		for (int i = numbers.size() -1; i >= 0; i--)
		{
			System.out.printf("%.4f\n" ,Math.sqrt(numbers.get(i).doubleValue()));
		}
		
		input.close();
	}

}
