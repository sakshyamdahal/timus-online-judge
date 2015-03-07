import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Taxi {
	
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String[] val = input.readLine().split(" ");
		int peterOrg = Integer.parseInt(val[0]);
		int peterInc = Integer.parseInt(val[1]);
		int driverOrg = Integer.parseInt(val[2]);
		int driverDec = Integer.parseInt(val[3]);
		
		// using iterative approach
		while (peterOrg < driverOrg)
		{
			
			System.out.printf("customer %d driver %d\n", peterOrg, driverOrg);
			
			peterOrg += peterInc;
			if (peterOrg > driverOrg)
			{
				peterOrg = driverOrg;
				break;
			}
			
			driverOrg -= driverDec;
			if (driverOrg < peterOrg)
			{
				break;
			}
		}
		
		System.out.println(peterOrg);	
	}	
}
