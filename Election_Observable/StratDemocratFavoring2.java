package Election_Observable;

public class StratDemocratFavoring2 implements IElectoralCollege 
{
	private int[] democratVotes;
	private int[] republicanVotes;
	
	public StratDemocratFavoring2()
	{
	democratVotes= new int[5];
	republicanVotes= new int[5];
	}
	
	public void CountVotes(State[] states) {
		//set the state with the highest electoral votes to the first state.
		 State maxState=states[0];
		
		
		for(int i=1;i<states.length;i++)
		{
		   if(states[i].getElectoral()>maxState.getElectoral())	
		   {
			   maxState=states[i];
		      
		   }
		}
		
		for(int i=0;i<states.length;i++)
		{
			
			//if the democratic party is winning the popular vote or has the highest electoral college, it wins the electoral vote.
			if(states[i].getDemocratic()>=states[i].getRepublican()
				||states[i].getName().equals(maxState.getName()))
				
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
