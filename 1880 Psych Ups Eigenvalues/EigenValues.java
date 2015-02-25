import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EigenValues {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<ArrayList<Integer>> test = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> eigen = new ArrayList<Integer>();
		
		while(input.hasNext())
		{
			int numValues = input.nextInt();
			ArrayList<Integer> temp = new ArrayList<Integer>();
			
			for (int i = 0; i < numValues; i++)
			{
				temp.add(input.nextInt());
			}
			
			test.add(temp);	
		}
		
		
		for (int i = 0; i < test.get(0).size(); i++)
		{
			if (test.get(1).contains(test.get(0).get(i)) && test.get(2).contains(test.get(0).get(i)))
			{
				eigen.add(test.get(0).get(i));
			}
		}
		
		System.out.println(eigen.size());
		
		
		
//		5
//		13 20 22 43 146
//		4
//		13 22 43 146
//		5
//		13 43 67 89 146
		
		
	}

}
