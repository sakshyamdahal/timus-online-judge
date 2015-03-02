import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Sport {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Take the input as an arrayList of LinkedList
		ArrayList<LinkedList<Integer>> list = new ArrayList<LinkedList<Integer>>();
			
		int dimension = input.nextInt();
		LinkedList<Integer> listItem;
		
		for (int i = 0; i < dimension; i++)
		{
			listItem = new LinkedList<Integer>();
			for (int j = 0; j < dimension; j++)
			{
				listItem.add(input.nextInt());
			}
			
			list.add(listItem);
		}
		
		// checking input
		printArrayList(list);
		System.out.println();
		
		input.close();
		
		int num;
		
		// for the first half
		for (int i = 0; i < list.size(); i++)
		{
			num = (int) list.get(i).remove();
			System.out.print(num + " ");
			
			for (int j = i - 1; j >= 0; j--)
			{
				if (! list.get(j).isEmpty())
				{
					num = (int) list.get(j).remove();
					System.out.print(num + " ");
				}
			}
		}
		
		// for the second half
		for (int i = 1; i < dimension; i++)
		{
			num = (int) list.get(dimension - 1).remove();
			
			if (list.get(dimension - 1).isEmpty())
				System.out.print(num);
			else
			System.out.print(num + " ");
			
			for (int j = dimension - 2; j >= 0; j--)
			{
				if (! list.get(j).isEmpty())
				{
					num = (int) list.get(j).remove();
					System.out.print(num+ " ");
				}
			}
		}
		
		

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
