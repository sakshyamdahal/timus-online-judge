import java.util.Scanner;

public class MathematiciansBerry {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int berryaPlusBasketa = input.nextInt();
		int berrybPlusBasketb = input.nextInt();
		
		input.nextInt();
		int basketb = input.nextInt();
		int basketa = input.nextInt();
		
		int berrya = berryaPlusBasketa - basketa;
		int berryb = berrybPlusBasketb - basketb;
		
		System.out.printf("%d %d\n", berrya, berryb);
		
		input.close();
		
		
		
	}
}
