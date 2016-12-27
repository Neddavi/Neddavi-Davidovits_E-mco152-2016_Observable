package Election_Observable;

public class StratToCloseToCall  implements IElectoralCollege {

	private int[] democratVotes;
	private int[] republicanVotes;
	
	public StratToCloseToCall()
	{
	democratVotes= new int[5];
	republicanVotes= new int[5];
	}
	
	public void CountVotes(State[] states) {
		
		State winner = null;
		for(int i=0;i<states.length;i++)
		{
			if(states[i].getDemocratic()>states[i].getRepublican())
			{
				if(winner==null)
					winner=states[i];
				
				else if(states[i].getDemocratic()-states[i].getRepublican()<winner.getDemocratic()-winner.getRepublican())
				winner=states[i];
			}
		}
		
		for(int i=0;i<states.length;i++)
		{
			if(states[i].getName().equals(winner.getName()))
			 {
				double split=(double)states[i].getElectoral()/2;
				democratVotes[i]=(int) Math.floor(split);
				republicanVotes[i]=(int)Math.ceil(split);
			 }
			
			else
			{
				if(states[i].getDemocratic()>states[i].getRepublican())
					democratVotes[i]=states[i].getElectoral();
				
				else
					republicanVotes[i]=states[i].getElectoral();
			}
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
