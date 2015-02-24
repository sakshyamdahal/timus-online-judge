import java.util.Scanner;

public class TwoGangster {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int harryShoot = input.nextInt();
		int larryShoot = input.nextInt();
		
		System.out.printf("%d %d\n", larryShoot - 1, harryShoot - 1);

	}

}
