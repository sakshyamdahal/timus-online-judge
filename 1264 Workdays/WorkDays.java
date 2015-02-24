import java.util.Scanner;

public class WorkDays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int m = input.nextInt();
		int timePerLine = 1;
		
		int totalLines = 0;
		
		for (int i = 0; i <= m; i++)
		{
			totalLines += n;
		}
		
		int totalTime = totalLines * timePerLine;
		
		System.out.println(totalTime);
		

	}

}
