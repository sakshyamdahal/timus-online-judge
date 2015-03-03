import java.util.Scanner;


public class LongProblemStatement {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int h = input.nextInt(); // num lines on each page
		int w = input.nextInt(); // symbol in each line
		int n = input.nextInt(); // num words in problem statement
	
		// get the words
		String[] words = new String[n];
		
		for (int i = 0; i < words.length; i++)
		{
			words[i] = input.next();
		}
		
		input.close();
		
		int i = 0;
		int totalLine = 0;
		
		while (i < words.length)
		{
		
			// while the words fit in the same line take them in a line
			int currentLineChar = words[i].length();
			//System.out.print(words[i] + " ");
			i++;
			
			do
			{
				if (i >= words.length)
					break;
				
				currentLineChar += 1 + words[i].length();
				i++;
			}
			while(currentLineChar <= w);
		
			if (currentLineChar > w)
				i--;
		
			// when they don't fit add index of line to 1 and start a new line with remaining words
			totalLine++;
		
		
			// totalLines / h gives the number of pages
		}
		
		//System.out.println(totalLine);
		int numPages = (int) (Math.ceil((double)totalLine / h));
		
		System.out.println(numPages);
		
	}
}
