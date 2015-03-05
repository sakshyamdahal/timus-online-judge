import java.util.Scanner;

/**
 * @author sakshyamdahal
 *
 */

public class OneStepFromHappiness {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String num = input.next();
		input.close();

		if (isLucky(pad((Integer.parseInt(num) + 1) + "",6)) || isLucky(pad((Integer.parseInt(num)-1)+"",6)))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
	
	// lucky if sum of first three digits == sum of last three digits
	public static boolean isLucky(String num)
	{
		if (sum(num.subSequence(0, 3).toString()) == sum(num.subSequence(num.length() - 3, num.length()).toString()))
			return true;
		return false;
	}
	
	// give sum of digits in a number which is passed as string
	public static int sum(String num)
	{
		int sum = 0;
		for (int i = 0; i < num.length(); i++)
		{
			sum += Integer.parseInt(num.charAt(i) + "");
		}
		
		return sum;
	}
	
	public static String pad(String num, int size)
	{
		if (num.length() == size)
			return num;
		
		while (num.length() != size)
		{
			num = "0" + num;
		}
		
		return num;
	}

}
