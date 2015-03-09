package arrays.strings.problems;
import java.util.Scanner;

public class Farm {

	/*
	 * Base on Fermat conjecture no such n greater than 2 exists
	 * such that a^n + b^n = c^n
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();

		switch (n)
		{
		case 1:
			System.out.println("1 2 3");
			break;
		case 2:
			System.out.println("3 4 5");
			break;
		default:
			System.out.println("-1");
		}
	}
}
