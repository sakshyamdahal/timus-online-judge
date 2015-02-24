/*
 * @author: Sakshyam Dahal
 * Date: Feb 24, 2015
*/


import java.util.Scanner;

public class UralSteaks {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = Integer.parseInt(input.next());
		int k = Integer.parseInt(input.next());
		
		int minutes;
		
		if (n > k)
			minutes = (int) Math.ceil((n*2.0) / k);
		else
			minutes = 2;
		
		
		System.out.println(minutes);

	}

}
