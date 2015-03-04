import java.util.Scanner;

public class SwampBattle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// number of blocks
		int n = input.nextInt();
		
		// number of droid in each block
		int k = input.nextInt();
		
		// number of droid that survived
		int droidSurvive = 0;
		
		// number of unused boom boom
		int unusedBoom = 0;
		
		
		for (int i = 0; i < n; i++)
		{
			int numBoom = input.nextInt();
			
			if (numBoom > k)
				unusedBoom += numBoom - k;
			else if (k > numBoom)
				droidSurvive += k - numBoom;
		}
		
		input.close();
		
		System.out.println(unusedBoom + " " + droidSurvive);

	}

}
