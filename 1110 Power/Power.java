import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author sakshyamdahal
 * 
 * You are given the whole numbers N, M and Y. 
 * A program that will find all whole numbers X in the 
 * interval [0, M − 1] such that X^N mod M = Y.
 * 
 */

public class Power {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		int y = input.nextInt();
		input.close();
		
		ArrayList<Integer> solution = betterPower(n,m,y);
		
		if (solution.size() == 0)
		{
			System.out.print(-1);
			return;
		}
		
		for (int i = 0; i < solution.size(); i++)
		{
			if (i == solution.size() - 1)
				System.out.print(solution.get(i));
			else
				System.out.print(solution.get(i) + " ");
		}
	}
	
	// not so efficient way of doing it
	public static ArrayList<Integer> power(int n, int m, int y)
	{
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		for (int x = 0; x < m; x++)
		{
			
			/* 
			 * calculates (x ^ n) % m
			 */
			BigInteger numb = BigInteger.valueOf((long) x % m);
			numb = numb.pow(n);
			numb = numb.remainder(BigInteger.valueOf((long)m));		
			int value = numb.intValue();
			
			
			if (value == y)
				num.add(x);
				
		}
		
		return num;
	}
	
	
	// better way of doing it 
	public static ArrayList<Integer> betterPower(int n, int m, int y)
	{
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		for (int x = 0; x < m; x++)
		{	
			// calculate x^n % m
			int value = powMode(x,n,m);
			
			if (value == y)
				num.add(x);
		}
		
		return num;
	}
	
	// calculate (x^n % y)
	public static int powMode(int x, int n, int m)
	{
		if (n == 1)
		{
			return x % m;
		}
		else if (n == 2)
		{
			return ((x%m) * (x % m)) % m;
		}
		else
		{
			if (n % 2 == 0)
			{
				return ( (powMode(x, n/2, m) * powMode(x,n/2,m)) % m);
			}
			else
			{
				return ( (powMode(x, n - 1, m) * powMode(x,1,m)) % m);
			}
				
		}
	}

}
