import java.util.Scanner;

public class SmsSpam {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String slogan = input.nextLine();
		input.close();
		
		int totalCost = 0;
		for (int i = 0; i < slogan.length(); i++)
		{
			totalCost += charCost(slogan.charAt(i));
		}
		
		System.out.println(totalCost);
		
	}
	
	public static int charCost(char character)
	{
		int value;
		
		if (character >= 'a' && character <= 'z')
		{
			value = ((character - 97) + 1) % 3;
		}
		else if (character == '.')
		{
			value = 1;
		}
		else if (character == ',')
		{
			value = 2;
		}
		else if (character == '!')
		{
			value = 0;
		}
		else
		{
			value = 1;
		}
		
		if (value == 0)
			return 3;
		else
			return value;
		
	}

}
