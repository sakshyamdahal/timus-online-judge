import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


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
				String numberForWord = wordToNumber(word, map);
				if (isSubstring(numberForWord, phoneNumber))
				{
					//mapWordToNumber.put(word, numberForWord);
					mapWordToNumber.put(numberForWord, word); // search with numbers instead of word
				}
			}

			//printMap(mapWordToNumber);

			// do the calculations for finding the number
			ArrayList<String> number = new ArrayList<String>();
			number.add(phoneNumber);
			String wordForNumber = numberToWord(mapWordToNumber, number);

			if (wordForNumber.split(" ")[wordForNumber.split(" ").length - 1].equals("-1"))
				wordForNumber = "No solution.";

			System.out.println(wordForNumber);



			// take another number
			phoneNumber = input.next();

		}
		while(! phoneNumber.equals("-1") && input.hasNext());


	}

	public static String numberToWord(HashMap<String, String> dic, ArrayList<String> list)
	{
		//System.out.println(Arrays.toString(list.toArray()));
		if (list.size() == 0)
		{
			return "No solution.";
		}
		ArrayList<String> temp = new ArrayList<String>();

		String word;
		for (int j = 0; j < list.size(); j++)
		{
			String[] wordsSofar = list.get(j).split(",");
			String number = wordsSofar[wordsSofar.length - 1];
			//System.out.println("number " + number);
			if (dic.containsKey(number.split(" ")[0]))
			{
				String solution = "";
				for (int i = 0; i < wordsSofar.length - 1; i++)
					solution += wordsSofar[i];
				
				return solution + " " + dic.get(number) ;
			}
			
			boolean foundWord = false;
			for (int i = 0; i < number.length(); i++)
			{
				String value = number.substring(0, number.length() - i);
				//System.out.println("word " + value);
				word = getKeyForValue(value, dic);
				//System.out.println("word " + word);
				
				if (!word.equals("-1"))
				{
					//System.out.println(word + " " + value);
					foundWord = true;
					String wordseq = "";
					for (int k = 0; k < wordsSofar.length - 1; k++)
					{
						wordseq += wordsSofar[k] + " ";
					}
					
					//System.out.println("wordseq " + wordseq);
					temp.add(String.format("%s,%s", wordseq +word, number.substring(number.length() - i, number.length())));
				}
			}
			
			if (foundWord == false)
				list.remove(j);
		}

		
		return numberToWord(dic, temp);
	}


	//	public static String numberToWord(String number, HashMap<String, String> dic)
	//	{
	//		
	//		return "";
	//	}

//	public static String getKeyForValue(String number, HashMap<String, String> map)
//	{
//		for (String key : map.keySet() )
//		{
//			if (map.get(key).equals(number))
//				return key;
//		}
//
//		return "-1";
//	}

	
	// changed to search with number
	public static String getKeyForValue(String number, HashMap<String, String> map)
	{
		if (map.containsKey(number))
		{
			return map.get(number);
		}
		else
		{
			return "-1";
		}
	}

	public static void printMap(HashMap<String, String> map)
	{
		for (String key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}
	}


	public static boolean isSubstring(String small, String big)
	{
		if (small.length() > big.length())
			return false;

		for (int i = 0; i <= big.length() - small.length(); i++)
		{
			if (big.substring(i, small.length() + i).equals(small))
				return true;
		}

		return false;
	}



}
