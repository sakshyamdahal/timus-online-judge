import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Hotel {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int order = input.nextInt();
		
		int count = 1;
		input.close();
		
		ArrayList<LinkedList<Integer>> list = new ArrayList<LinkedList<Integer>>();
		LinkedList<Integer> values;
		
		// add first half
		for (int i = 0; i < order; i++)
		{
			if (list.size() != i+1)
			{
				values = new LinkedList<Integer>();
				list.add(values);
				
			}
			
			
			for (int j = 0; j <= i; j++)
			{
				list.get(j).addFirst(count++);
			}
			
		}
		
		// add second half
		for (int i = 1; i < order; i++)
		{
			list.get(i).addFirst(count++);
			
			for (int j = i + 1; j < order; j++)
			{
				list.get(j).addFirst(count++);
			}
		}
		
		printArrayList(list);

	}
	
	
	// to verify if input was taken correctly
		private static void printArrayList(ArrayList<LinkedList<Integer>> list) {
			for (LinkedList<Integer> link : list)
			{
				for (int item : link)
				{
					System.out.printf("%d ", item);
				}
				
				System.out.println();
			}
			
		}


}
