import java.util.Scanner;

public class Centipede {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		
		// case 1: take all right and then go for left
		int totalTime1 = (40 * 2) + ( (b - 40) * 2) + 40;
		
		// case 2: take 39 right take all left take all right
		int totalTime2 = (39 * 2) + (40 * 1) + ((a - 40)*2) + 1;
		
		// print out the maximum time worst case scenario
		System.out.println(Math.max(totalTime1, totalTime2));

	}

}