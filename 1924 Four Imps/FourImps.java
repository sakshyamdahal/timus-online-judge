import java.util.Scanner;

public class FourImps {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numFields = input.nextInt();
		input.close();
		
		int sum = ( numFields * (numFields + 1) ) / 2;
		
		if (sum % 2 == 0)
			System.out.println("black");
		else
			System.out.println("grimy");

	}

}
