import java.util.Scanner;

public class Chocolate2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int row = input.nextInt();
		int column = input.nextInt();
		
		int numLines = (row * column) - 1;
		
		if (even(numLines))
			System.out.println("[second]=:]");
		else
			System.out.println("[:=[first]");
	}
	
	public static boolean even(int num)
	{
		return num % 2 == 0;
	}

}
