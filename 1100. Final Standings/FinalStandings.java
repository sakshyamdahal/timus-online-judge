import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class FinalStandings  {
	
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		//Scanner input = new Scanner(System.in);
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int numTeams = Integer.parseInt(input.readLine());
		//ArrayList<Team> teams = new ArrayList<Team>();
		Team[] teams = new Team[numTeams];
		
		for (int i = 0; i < numTeams; i++)
		{
			String line = input.readLine();
			String[] lineArr = line.split(" ");
			
			Team teamName = new Team(Integer.parseInt(lineArr[0]), Integer.parseInt(lineArr[1]));
			teams[i] = teamName;
			//teams.add(teamName);
		}
		input.close();
		
		//Collections.sort(Arrays.asList(teams));
		Collections.sort(Arrays.asList(teams), Collections.reverseOrder());
		
		for (Team name : teams)
		{
			System.out.println(name.teamId + " " + name.numSolvedProb);
		}
		
	}
}

class Team implements Comparable<Team>{
	public int teamId;
	public int numSolvedProb;
	
	public Team(int id, int solveProb)
	{
		teamId = id;
		numSolvedProb = solveProb;
	}
	public int compareTo(Team anotherTeam) throws ClassCastException{
		if (!(anotherTeam instanceof Team))
			throw new ClassCastException("A team object is required");
		
		return this.numSolvedProb - ((Team)anotherTeam).numSolvedProb;
	}
}
