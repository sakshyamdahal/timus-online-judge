import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Hotel {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int order = input.nextInt();
		
		input.close();
		
		ArrayList<LinkedList<Integer>> list = new ArrayList<LinkedList<Integer>>();
		LinkedList<Integer> temp;
		
		for (int i = 0; i < order; i++)
		{
			temp = new LinkedList<Integer>();
			for (int j = 0; j < order; j++)
			{
				temp.add( (i * order) + j + 1);
			}
			
			list.add(temp);
		}
		
		printArrayList(list);
		System.out.println();
		
		ArrayList<LinkedList<Integer>> output = new ArrayList<LinkedList<Integer>>();
		int numElements = 0;
		temp = new LinkedList<Integer>();
		for (int i = 0; i < order; i++)
		{
			
			int num = list.get(i).remove();
			temp.add(num);
			numElements++;
			
			for (int j = i - 1; j >= 0; j--)
			{
				if (! list.get(j).isEmpty())
				{
					num = list.get(j).remove();
					temp.add(num);
					numElements++;
					
				}
			}
			
			if (numElements % order == 0)
			{
				output.add(temp);
				temp = new LinkedList<Integer>();
			}
			
			
			
		}
		
		printArrayList(output);

	}
	
	
	// to verify if input was taken correctly
		private static void printArrayList(ArrayList<LinkedList<Integer>> list) {
			for (LinkedList<Integer> link : list)
			{
				for (int item : link)
				{
					System.out.print(item + " ");
				}
				
				System.out.println();
			}
			
		}


}
