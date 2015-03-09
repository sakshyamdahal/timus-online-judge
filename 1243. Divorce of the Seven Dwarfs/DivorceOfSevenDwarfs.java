import java.util.Scanner;

public class DivorceOfSevenDwarfs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String property = input.next();
		input.close();
		
		int remainderAfterDividing = sevenRemainder(property);
		System.out.println(remainderAfterDividing);
	}
	
	/* uses multiplication by 3 method to find the remainder after diving a number 
	 * by 7
	 */
	public static int sevenRemainder(String value)
	{
		int sum = Integer.parseInt(value.charAt(0) + "");
		for (int i = 1; i < value.length(); i++)
		{
			sum = (sum % 7) * 3 + Integer.parseInt(value.charAt(i) + "");
		}
		
		return sum % 7;
	}

}
