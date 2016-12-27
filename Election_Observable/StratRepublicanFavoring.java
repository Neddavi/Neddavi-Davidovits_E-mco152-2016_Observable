package Election_Observable;
import Election_Observable.State;
public class StratRepublicanFavoring implements IPopularVote {

	private int[] democratVotes;
	private int[] republicanVotes;
	
	public StratRepublicanFavoring()
	{
	democratVotes= new int[5];
	republicanVotes= new int[5];
	}
	
	public void CountVotes(State[] states) {
	
	for(int i=0; i<states.length; i++)
	{
		democratVotes[i]=(int)(states[i].getDemocratic()*.95);
		republicanVotes[i]= (int)(states[i].getRepublican());
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
