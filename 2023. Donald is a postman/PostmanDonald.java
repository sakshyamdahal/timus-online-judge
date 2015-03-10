import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class PostmanDonald {
	
	public static void main(String[] args) throws IOException, NumberFormatException
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int numLetters = Integer.parseInt(input.readLine());
		HashMap<Character, Integer> map = getMap();
		
		
		String boxName;
		int prevBox = 0;
		int totalSteps = 0;
		
		for(int i = 0; i < numLetters; i++)
		{
			boxName = input.readLine();
			
			totalSteps += Math.abs(prevBox - map.get(boxName.charAt(0)));
			prevBox = map.get(boxName.charAt(0));
			
		}
		
		input.close();
		System.out.println(totalSteps);
	}
	
	
	public static HashMap<Character, Integer> getMap()
	{
		HashMap<Character, Integer> box = new HashMap<Character, Integer>();
		box.put('A', 0); box.put('P', 0); box.put('O', 0); box.put('R', 0);
		box.put('B',1); box.put('M',1); box.put('S',1);
		box.put('D', 2); box.put('G', 2); box.put('J', 2); box.put('K', 2); box.put('T', 2); box.put('W', 2);
		
		return box;
	}
}
