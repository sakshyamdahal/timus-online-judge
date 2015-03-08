import java.util.Scanner;

public class Fuses {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int firstDay = input.nextInt();
		int lastDay = input.nextInt();
		input.close();
		
		// calculate how many odd numbers from firstDay and lastDay inclusive
		int totalFuses = ( !(lastDay % 2 == 0) ||  !(firstDay % 2 == 0))? ((lastDay - firstDay) / 2) + 1 : (lastDay - firstDay) / 2;
		System.out.println(totalFuses);
		
	}
}
