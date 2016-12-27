package Election_Observable;
import java.util.Observable;

public class NumberOfVotes extends Observable
{
	 private State[] States;
	 
public NumberOfVotes(State[] States)
{
	this.States=States;
	 setChanged();
	 notifyObservers();
	 
}

public State[] getStates()
{
	return States;
}

public void setStates(State[] States){
	this.States=States;
	setChanged();
	notifyObservers();
}
 
 
}
