package Election_Observable;

public class StatRebulicanFavoring2  implements IElectoralCollege {

	private int[] democratVotes;
	private int[] republicanVotes;
	
public 	StatRebulicanFavoring2()
{
	democratVotes= new int[5];
	republicanVotes= new int[5];
}

public void CountVotes(State[] states) 
{
	
	for(int i=0; i<states.length;i++)
	{
		//Texas will always be republican.
		if(states[i].getName().equals("TEXAS")
		   ||states[i].getRepublican()>=states[i].getDemocratic())
			
			republicanVotes[i]=states[i].getElectoral();
		
		else
			democratVotes[i]=states[i].getElectoral();
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
