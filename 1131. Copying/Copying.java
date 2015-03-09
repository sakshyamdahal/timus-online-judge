import java.util.Scanner;

public class Copying {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numComputer = input.nextInt();
		int numCable = input.nextInt();
		input.close();
		
		int totalTime = calculateCopyTime(numComputer, numCable);
		System.out.println(totalTime);
	}
	
	public static int calculateCopyTime(int numComputer, int numCable)
	{
		int copiedTo = 1;
		int totalTime = 0;
		while(copiedTo < numComputer)
		{
			if (copiedTo > numCable)
			{
				int remainingComputers = numComputer - copiedTo;
				totalTime += remainingComputers / numCable;
				
				if (remainingComputers % numCable == 0)
				{
					return totalTime;
				}
				else
					return ++totalTime;
			}
			else
			{
				copiedTo += copiedTo;
				totalTime++;
			}
		}
		
		return totalTime;
		
	}

}
