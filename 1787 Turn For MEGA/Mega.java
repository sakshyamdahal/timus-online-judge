import java.util.Scanner;

/*
 * @author: Sakshyam Dahal
 * Feb 24, 2015
 */


public class Mega {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] mega = input.nextLine().split(" ");
		int carPassPerMinute = Integer.parseInt(mega[0]);
		
		String[] numCars = input.nextLine().split(" ");
		
		for (int i = 0; i < Integer.parseInt(mega[1]) - 1; i++)
		{
			int remaining = Integer.parseInt(numCars[i]) - carPassPerMinute;
			if (remaining > 0)
			{
				numCars[i + 1] = (Integer.parseInt(numCars[i + 1]) + remaining) + "";
			}
		}
		
		int remainingAtLast = Integer.parseInt(numCars[numCars.length - 1]) - carPassPerMinute;
		
		
		if (remainingAtLast < 0)
			remainingAtLast = 0;
		
		System.out.println(remainingAtLast);
		

	}

}
