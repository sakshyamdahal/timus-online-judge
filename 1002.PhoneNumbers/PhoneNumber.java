import java.util.HashMap;
import java.util.Scanner;


// TODO: Fix the solution for this input
/*
	1234567890
	10
	jafgl
	n
	ehlnr
	tyz
	ru
	ja
	iad
	jadh
	pty
	yo



	ans:ja ehlnr tyz

*/

public class PhoneNumber {
	
	
	//	
	//	1 ij    2 abc   3 def
	//	4 gh    5 kl    6 mn
	//	7 prs   8 tuv   9 wxy
	//	        0 oqz
	
	// input : no spaces no extra punctuation mark just alphabets
	public static String wordToNumber(String word, HashMap<Character, Character> map)
	{
		StringBuffer phoneNumber = new StringBuffer();
		
		for (int i = 0; i < word.length(); i++)
		{
			char mapKey = word.charAt(i);
			phoneNumber.append(map.get(mapKey));
		}
		
		return phoneNumber.toString();
	}
	
	
	// test this class
	public static void main(String[] args)
	{
		HashMap<Character, Character> map;
		
		
		map = new HashMap<Character, Character>();
//		
//		1 ij    2 abc   3 def
//		4 gh    5 kl    6 mn
//		7 prs   8 tuv   9 wxy
//		        0 oqz
		
		// put data in map
		map.put('i', '1');
		map.put('j', '1');
		
		map.put('a', '2');
		map.put('b', '2');
		map.put('c', '2');
		
		map.put('d', '3');
		map.put('e', '3');
		map.put('f', '3');
		
		map.put('g', '4');
		map.put('h', '4');
		
		map.put('k', '5');
		map.put('l', '5');
		
		map.put('m', '6');
		map.put('n', '6');
		
		map.put('p', '7');
		map.put('r', '7');
		map.put('s', '7');
		
		map.put('t', '8');
		map.put('u', '8');
		map.put('v', '8');
		
		map.put('w', '9');
		map.put('x', '9');
		map.put('y', '9');
		
		map.put('o', '0');
		map.put('q', '0');
		map.put('z', '0');
		
		
//		System.out.println(PhoneNumber.wordToNumber("hello", map));
		
		// sample input
//		7325189087
//		5
//		it
//		your
//		reality
//		real
//		our
		Scanner input = new Scanner(System.in);
		String phoneNumber = input.next();
		HashMap<String, String> mapWordToNumber = new HashMap<String, String>();
		do
		{
			// clear the map for the next input
			mapWordToNumber.clear();
			
			int numWords = Integer.parseInt(input.next());
			for (int i = 0; i < numWords; i++)
			{
				String word = input.next();
				mapWordToNumber.put(word, wordToNumber(word, map));
			}
			
			printMap(mapWordToNumber);
			
			// do the calculations for finding the number
			String wordForNumber = numberToWord(phoneNumber, mapWordToNumber);
			
			if (wordForNumber.split(" ")[wordForNumber.split(" ").length - 1].equals("-1"))
				wordForNumber = "No solution.";
			
			System.out.println(wordForNumber);
		
			
			
			// take another number
			phoneNumber = input.next();
			
		}
		while(! phoneNumber.equals("-1") && input.hasNext());
		
		
		
		
	}
	
	public static String numberToWord(String number, HashMap<String, String> dic)
	{
		
		String word = "";
		
		if (number.equals(""))
			return "";
		else
		{
			for (int i = 0; i < number.length(); i++)
			{
			//	System.out.println(number.substring(0, number.length() - i));
				word = getKeyForValue(number.substring(0, number.length() - i), dic);
				if (! word.equals("-1"))
				{
					
					return word + " " + numberToWord(number.substring(number.length() - i, number.length()), dic);
				}
					
			}
		}
		
		return "-1";
		
		
		
	}
	
	public static String getKeyForValue(String number, HashMap<String, String> map)
	{
		for (String key : map.keySet() )
		{
			if (map.get(key).equals(number))
				return key;
		}
		
		return "-1";
	}
	
	
	public static void printMap(HashMap<String, String> map)
	{
		for (String key : map.keySet()) {
	        System.out.println(key + " " + map.get(key));
	    }
	}
	


}
