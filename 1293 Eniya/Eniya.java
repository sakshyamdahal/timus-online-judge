import java.util.Scanner;

public class Eniya {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numRectangle = input.nextInt();
		int length = input.nextInt();
		int width = input.nextInt();
		
		System.out.println(numRectangle * length * width * 2);

	}

}
