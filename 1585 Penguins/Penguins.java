import java.util.HashMap;
import java.util.Scanner;

public class Penguins {

	static String penguinOne = "Emperor Penguin";
	static String penguinTwo = "Macaroni Penguin";
	static String penguinThree = "Little Penguin";
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int numPenguin = Integer.parseInt(input.nextLine());
		
		HashMap<String, Integer> penguinCount = new HashMap<String, Integer>();
		penguinCount.put(penguinOne, 0);
		penguinCount.put(penguinTwo, 0);
		penguinCount.put(penguinThree, 0);
		
		for (int i = 0; i < numPenguin; i++)
		{
			String penguin = input.nextLine();
			penguinCount.put(penguin, penguinCount.get(penguin) + 1);
		}

		input.close();
		
		int maxValue = -1;
		String maxKey = "";
		for (String key : penguinCount.keySet())
		{
			if (penguinCount.get(key) > maxValue)
			{
				maxValue = penguinCount.get(key);
				maxKey = key;
			}
		}
		
		System.out.println(maxKey);
		
	}
	
}
