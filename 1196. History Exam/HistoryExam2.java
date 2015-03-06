import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;


public class HistoryExam2 {
	
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		int numProfDates = Integer.parseInt(input.readLine());
		
		HashSet<Integer> professorDateList = new HashSet<Integer>();
		
		for (int i = 0; i < numProfDates; i++)
		{
			professorDateList.add(Integer.parseInt(input.readLine()));
		}
		
		int numOccurances = 0;
		
		int numStudentDates = Integer.parseInt(input.readLine());
		
		for (int i = 0; i < numStudentDates; i++)
		{
			if(professorDateList.contains(Integer.parseInt(input.readLine())))
			{
				numOccurances++;
			}
		}
		
		input.close();
		
		System.out.println(numOccurances);
	}
}
