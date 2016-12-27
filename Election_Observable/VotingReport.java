package Election_Observable;
import java.util.Observable;
import java.util.Observer;
import java.time.LocalDate;
import java.time.LocalTime;
import Election_Observable.State;

public abstract class VotingReport implements Observer
{
	IPopularVote popularVote;
	IElectoralCollege electoralVote;
	
	private State[] state;
	
	private int[] democratElectoral;
	private int[] republicanElectoral;
	private int[] democratPopular;
	private int[] republicanPopular;
	
	public VotingReport(Observable observable)
	{
		observable.addObserver(this);
		this.democratElectoral=new int[5];
		this.democratPopular=new int[5];
		this.republicanElectoral=new int[5];
		this.republicanPopular= new int[5];
		this.state=new State[5];
	}
		
	
	
	public void update(Observable observable, Object stateObject)
	{
		if (observable instanceof NumberOfVotes)
		{
			NumberOfVotes numberOfVotes = (NumberOfVotes) observable;
			
			this.state=numberOfVotes.getStates();
			
			electoralVote.CountVotes(state);
			popularVote.CountVotes(state);
			
			
			democratElectoral=electoralVote.getDemocratElect();
			republicanElectoral=electoralVote.getRepublicanElect();
			
			democratPopular=popularVote.getDemocratPop();
			republicanPopular=popularVote.getRepublicanPop();
			
			
			display();
		}
	}

	private void display() 
	{
		
		long totalDemocrat=0;
		long totalRepub=0;
		
		
		System.out.println("\nAll reports are purely observational and not legally binding in any way "+LocalDate.now()+" "+LocalTime.now());
		System.out.print("\t\t\t");
		for(State stateX:state)
		{
			System.out.println(" " +stateX.getName());
		}
		    System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------------------------");
		    
		System.out.println("Popular Democratic: ");  
		for(long dem:democratPopular)
		{
			System.out.print(dem);
		}
		
	    System.out.println("Popular Republican:");
		for(long rep: republicanPopular)
		{
			System.out.println(rep);
		}
		
		 System.out.println("Electoral Democratic:");
		for(int dem:democratElectoral)
		{
			System.out.println(dem);
		}
		
		 System.out.println("Electoral Republican:");
		for(int rep:republicanElectoral)
		{
			System.out.printf("%-,25d", rep);
		}
		
	
		for(int i=0;i<state.length;i++)
		{
			totalDemocrat+=democratElectoral[i];
			totalRepub+=republicanElectoral[i];
		}
		System.out.println("\n\nTotal Democratic votes: "+totalDemocrat);
		System.out.println("Total Republican votes: "+ totalRepub);
	}

	}
