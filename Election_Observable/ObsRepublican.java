package Election_Observable;
import java.util.Observable;

public class ObsRepublican extends VotingReport {

	public ObsRepublican(Observable observable) {
		super(observable);
		
		electoralVote=new StatRebulicanFavoring2();
		   
		popularVote=new StratRepublicanFavoring();
		
	}

}
