import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int limit = input.nextInt();
		input.close();
		
		int sum = sumFromOne(limit);
		
		System.out.println(sum);
		

	}
	
	public static int sumFromOne(int n)
	{
		if (n == 0)
			return 1;
		
		int sum = (Math.abs(n)) * (Math.abs(n) + 1) / 2;
		
		if (n < 0)
			return (sum - 1) * -1;
		else
			return sum;
	}

}
