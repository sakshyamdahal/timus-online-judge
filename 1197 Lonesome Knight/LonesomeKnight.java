import java.util.Scanner;

public class LonesomeKnight {

	static final int VALUEa = 97;
	static final int BOARD_ROW = 8;
	static final int BOARD_COLUMN = 8;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// increase 2 row and increase 1 column
		// increase 2 row and decrease 1 column
		// decrease 2 row increase 1 column
		// decrease 2 row and decrease 1 column
		
		// increase 2 column and increase 1 row
		// increase 2 column and decrease 1 row
		// decrease 2 column and increase 1 row
		// decrease 2 column and decrease 1 row
		
		int[][] chessBoard = new int[BOARD_ROW][BOARD_COLUMN];
		// System.out.println( 'h' - VALUEa + 1);
		
		int numCases = input.nextInt();
		
		for (int i = 0; i < numCases; i++)
		{
			String position = input.next();
			int knightRow = (position.charAt(0) - VALUEa + 1) - 1;
			int knightColumn = Integer.parseInt(position.charAt(1) + "") - 1;
			
			
			int possibleMoves = 0;
			
			// two moves horizontal and one move vertical
			if ( inBounds(knightRow + 2, knightColumn - 1))
				possibleMoves++;
			if (inBounds(knightRow + 2, knightColumn + 1))
				possibleMoves++;
			if (inBounds(knightRow - 2,knightColumn - 1))
				possibleMoves++;
			if (inBounds(knightRow - 2,knightColumn + 1))
				possibleMoves++;
			
			// one move horizontal and two moves vertical
			if ( inBounds(knightRow + 1,knightColumn + 2 ))
				possibleMoves++;
			if (inBounds(knightRow - 1,knightColumn + 2))
				possibleMoves++;
			if (inBounds(knightRow - 1, knightColumn - 2))
				possibleMoves++;
			if ( inBounds(knightRow + 1, knightColumn - 2))
				possibleMoves++;
			
			System.out.println(possibleMoves);
		}
		
		

	}
	
	public static boolean inBounds(int row, int column)
	{
		return ( (row < BOARD_ROW && row >= 0 ) && (column < BOARD_COLUMN && column >= 0));
	}

}
