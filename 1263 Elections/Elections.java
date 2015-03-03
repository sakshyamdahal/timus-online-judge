import java.util.HashMap;
import java.util.Scanner;

public class Elections {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		
		int numCandidate = input.nextInt();
		for (int i = 1; i <= numCandidate; i++)
		{
			map.put(i, 0);
		}
		
		int numElectors = input.nextInt();
		
		for (int i = 0; i < numElectors; i++)
		{
			int key = input.nextInt();
			map.put(key, map.get(key) + 1);
		}
		
		input.close();
		
		
		for (int i = 1; i <= numCandidate; i++)
		{
			// get num votes for a candidate
			int value = map.get(i);
			
			// find % vote received
			System.out.printf("%.2f%%\n", (value/(double)numElectors) * 100.0);
		}
	}

}
