package Election_Observable;

public class StratTwoPercentDemocrat implements IElectoralCollege  {

	private int[] democratVotes;
	private int[] republicanVotes;
	
	public StratTwoPercentDemocrat()
	{
	democratVotes= new int[5];
	republicanVotes= new int[5];
	}
	
	public void CountVotes(State[] state) {
		
State[] states=copyStates(state);
			
			for(int i=0;i<states.length;i++)
			{
				
				states[i].setDemocratic(states[i].getDemocratic()+((long)(states[i].getRepublican()*.02)));
				
				
				states[i].setRepublican((long)(states[i].getRepublican()*.98));
				
				if(states[i].getDemocratic()>states[i].getRepublican())
					democratVotes[i]=states[i].getElectoral();
				
				else
					republicanVotes[i]=states[i].getElectoral();
			}
			
     	
	}
		
 
		public State[] copyStates(State[] OriginalStates){
			
			State[]states=new State[5];
			
			for(int i=0;i<OriginalStates.length;i++)
			{
				states[i]=OriginalStates[i];
			}
			
			return states;
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
