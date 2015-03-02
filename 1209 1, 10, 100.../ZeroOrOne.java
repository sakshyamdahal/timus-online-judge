import java.util.Scanner;

public class ZeroOrOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numTimes = input.nextInt();
		// System.out.println(getImmediateN(numTimes));
		String format;
		
		for (int i = 0; i < numTimes; i++)
		{
			long num = input.nextInt();
//			long forOne = getImmediateN(num) + 1;
//			
			format = (i == numTimes - 1) ? "" : " ";
//			
//			if (num == forOne)
//				System.out.print(1 + format);
//			else
//				System.out.print(0 + format);
			
			if (fastN(num))
				System.out.print(1 + format);
			else
				System.out.print(0 + format);
		}
		
		input.close();
		
	}
	// direct use of formula
	// since digit 1 will only be in the places 1,2,4,7,11...
	// ie in place 1 + n * (n+1) / 2
	// solving the equation for n we get digit 1 only if solution is an integer
	// ie (sqrt(8*k - 7) - 1 /2 ) % 1 == 0
	public static boolean fastN(long k)
	{
		double n = (Math.sqrt(8*k - 7) -1) / 2;
		if (n % 1 == 0)
			return true;
		else
			return false;
	}
	
	// use of binary search to get the immediate getN(n) less than num
	public static long getImmediateN(long num)
	{
		long high = num;
		long low = 1;
		
		long n =(high + low) / 2;
		
		
		while (! (getN(n) <= num) || ! (getN(n+1) > num))
		{
			if (getN(n) > num)
			{
				high = n;
				n = (high + low) / 2;
			}
			else if (getN(n) < num)
			{
				low = n;
				n = (high + low) / 2;
			}
		}
		
		return getN(n);
		
	}
	
	public static long getN(long n)
	{
		return n * (n+1) / 2;
	}

}
