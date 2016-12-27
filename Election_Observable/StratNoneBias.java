package Election_Observable;

public class StratNoneBias implements IPopularVote{

	private int[] democratVotes;
	private int[] republicanVotes;
	
	public StratNoneBias()
	{
	democratVotes= new int[5];
	republicanVotes= new int[5];
	}
	
	public void CountVotes(State[] states) {
		
		for(int i=0;i<states.length;i++)
		{
			democratVotes[i]=states[i].getDemocratic();
			republicanVotes[i]=states[i].getRepublican();
		}
	}
	public int[] getDemocratPop()
	{
		return democratVotes;
	}
	
	public int[] getRepublicanPop()
	{
		return republicanVotes;
	}
}
