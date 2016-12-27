package Election_Observable;
import java.util.Observable;




public class ObsHonestVote extends VotingReport {
 
	public ObsHonestVote(Observable observable) {
		super(observable);
		electoralVote=new StratNoneBias2();
		popularVote=new  StratNoneBias();
		
	}



}
