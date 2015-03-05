import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author sakshyamdahal
 *
 */
public class Spammer {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int numSubmissions = input.nextInt();
		
		HashSet<String> spammer = new HashSet<String>();
		ArrayList<String> temp = new ArrayList<String>();
		
		
		for (int i = 0; i < numSubmissions; i++)
		{
			String teamName = input.next();
			if (temp.contains(teamName))
				spammer.add(teamName);
			else
				temp.add(teamName);
		}
		input.close();
		
		for (String name : spammer)
		{
			System.out.println(name);
		}
	}
}
