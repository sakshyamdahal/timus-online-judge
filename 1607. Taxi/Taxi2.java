import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Taxi2 {
	
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String[] val = input.readLine().split(" ");
		int peterOrg = Integer.parseInt(val[0]);
		int peterInc = Integer.parseInt(val[1]);
		int driverOrg = Integer.parseInt(val[2]);
		int driverDec = Integer.parseInt(val[3]);
		
		peterOrg = taxiPrice(peterOrg, peterInc, driverOrg, driverDec);
		
		System.out.println(peterOrg);	
	}
	
	// using binary search approach
	public static int taxiPrice(int customer, int increase, int driver, int decrease)
	{
		int nLow = 0;
		int nHigh = (int) (Math.ceil( (driver - customer) / (double)increase));
		int nMid;
		int tempCust;
		int tempDriver;
		
		while(true)
		{
			nMid = (nLow + nHigh) / 2;
			tempCust = customer + (nMid * increase);
			tempDriver = driver - (nMid * decrease);
			
			//System.out.printf("customer %d driver %d\n", tempCust, tempDriver);
			
			if (tempCust == tempDriver)
			{
				break;
			}
			else if ((int) Math.abs(tempCust - tempDriver) >= 0 && (int) Math.abs(tempCust - tempDriver) <= increase)
			{
				if (tempDriver > tempCust)
				{
					tempCust = tempDriver;
					break;
				}
				else
				{
					break;
				}
			}
			else if (tempCust < tempDriver)
			{
				nLow = nMid;
			}
			else
			{
				nHigh = nMid;
			}
			
		}
		return tempCust;
	}
	
}
