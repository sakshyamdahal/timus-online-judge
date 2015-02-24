import java.util.Scanner;

public class BicycleCodes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int firstLock = Integer.parseInt(input.next());
		int secondLock = Integer.parseInt(input.next());
		boolean match = false;
		
		//System.out.println(firstLock + "     " + secondLock);
		int thiefCode = 0;
		
		while(thiefCode <= firstLock || thiefCode <= secondLock)
		{
			if (even(thiefCode) && thiefCode == firstLock)
			{
				System.out.println("yes");
				match = true;
				break;
			}
			else if (!even(thiefCode) && thiefCode == secondLock)
			{
				System.out.println("yes");
				match = true;
				break;
			}
			
			thiefCode++;
				
		}
		if (!match)
			System.out.println("no");
		
		
		
	}
	
	public static boolean even(int num)
	{
		return num % 2 == 0;
	}

}
