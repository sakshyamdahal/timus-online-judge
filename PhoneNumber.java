public void readData()
{
	Scanner input = new Scanner(System.in);
	
	while (! input.next().equals(“-1”) )
	{
		String phoneNumber = input.next();
		int numWords = Integer.parseInt(input.next());
		
		HashMap<String, String> map = new HashMap<String, String>();

		for (int i = 0; i < numWords; i++)
		{
			String word = input.next();
			String wordInNumber = getValue(word);
			map.put(word, wordInNumber);
		}

		String wordSequence = phonenumToWords(map, phoneNumber);
	}
}


public String phonenumToWords(HashMap<String, String> map, String num)
{
	if (num.equals(“”))
		return “”;

	else
	{
		for ( int i = num.length() - 1; i >= 0; i--)
		{
			String seq = 		
		}

	}
