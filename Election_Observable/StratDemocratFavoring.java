package Election_Observable;

import Election_Observable.State;

public  class StratDemocratFavoring implements IPopularVote
{
	private int[] democratVotes;
	private int[] republicanVotes;
	
	public StratDemocratFavoring()
	{
	democratVotes= new int[5];
	republicanVotes= new int[5];	
	}
	
	public void CountVotes(State[] states){
State maxRepub=states[0];
		
		
		for(int i=1;i<states.length;i++)
		{
			if(states[i].getRepublican()>maxRepub.getRepublican())
				maxRepub=states[i];
		}

		
		for(int i=0;i<states.length;i++)
		{
			
			if(states[i].getName().equals(maxRepub.getName()))
			{
				republicanVotes[i]=0;
				democratVotes[i]= states[i].getDemocratic();
			}
			else{
			democratVotes[i]=states[i].getDemocratic();
			republicanVotes[i]=states[i].getRepublican();
			}
			
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
