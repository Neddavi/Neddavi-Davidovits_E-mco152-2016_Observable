package Election_Observable;

public class StratNoneBias2 implements IElectoralCollege 
{
	private int[] democratVotes;
	private int[] republicanVotes;

	public StratNoneBias2()
	{
	democratVotes= new int[5];
	republicanVotes= new int[5];
	}
	
	public void CountVotes(State[] states) {
		
		for(int i=0;i<states.length;i++)
		{
		   if(states[i].getDemocratic()>states[i].getRepublican())
		   
			   democratVotes[i]=states[i].getElectoral();
		   else
			   republicanVotes[i]=states[i].getElectoral();
	    }
		
	}
	
	public int[] getDemocratElect()
	{
		return democratVotes;
	}
	
	public int[] getRepublicanElect()
	{
		return republicanVotes;
	}
}
