package Election_Observable;
import java.util.Observable;


public class ObsDemPopularVote  extends VotingReport {

	public ObsDemPopularVote(Observable observable) {
		super(observable);
		electoralVote=new StratToCloseToCall();
		popularVote=new StratDemocratFavoring();
		
	}

}
