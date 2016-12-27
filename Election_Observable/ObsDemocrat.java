package Election_Observable;
import java.util.Observable;


public class ObsDemocrat   extends VotingReport{

	public ObsDemocrat(Observable observable) {
		super(observable);
		electoralVote=new StratDemocratFavoring2();
		popularVote=new StratDemocratFavoring();
	}

}
