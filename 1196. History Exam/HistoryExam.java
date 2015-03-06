import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class HistoryExam {
	
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		int numProfDates = Integer.parseInt(input.readLine());
		
		int[] professorDateList = new int[numProfDates];
		
		for (int i = 0; i < numProfDates; i++)
		{
			professorDateList[i] = Integer.parseInt(input.readLine());
		}
		
		int numOccurances = 0;
		
		int numStudentDates = Integer.parseInt(input.readLine());
		
		for (int i = 0; i < numStudentDates; i++)
		{
			int studentDate = Integer.parseInt(input.readLine());
			if(!(Arrays.binarySearch(professorDateList, studentDate) < 0))
			{
				numOccurances++;
			}
		}
		
		input.close();
		System.out.println(numOccurances);
	}
}
