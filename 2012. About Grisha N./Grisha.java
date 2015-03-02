import java.util.Scanner;

public class Grisha {
	
	static final int TOTAL_PROBLEMS = 12;
	static final int TOTAL_HOURS = 5;
	static final int TIME_FOR_EACH = 45;
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numProbInFirstHour = input.nextInt();
		
		// remaining problems after first hour
		int numProbRemaining = TOTAL_PROBLEMS - numProbInFirstHour;
		
		// time to calculate num problems in hours given time to solve each problem in minutes
		double totalTimeReq = (numProbRemaining * TIME_FOR_EACH) / 60.0;
		
		if (totalTimeReq <= (TOTAL_HOURS - 1))
			System.out.println("YES");
		else
			System.out.println("NO");
		
		input.close();
		
		

	}

}
