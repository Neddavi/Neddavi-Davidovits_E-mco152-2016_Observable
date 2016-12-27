package Election_Observable;
import java.util.Observable;


public class ObsRepElectoral  extends VotingReport {

	public ObsRepElectoral(Observable observable) {
		super(observable);
		electoralVote=new StratDemocratFavoring2();
		popularVote=new StratNoneBias();
	}
}
