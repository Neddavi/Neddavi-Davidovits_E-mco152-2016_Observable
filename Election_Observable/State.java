package Election_Observable;

public class State {

	private String name;
	private long democratic;
	private int republican;
	private int electoral;
	
	
	
	public State(String name, int democratic,int republican, int electoral){
		this.name=name;
		this.democratic=democratic;
		this.republican=republican;
		this.electoral=electoral;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDemocratic() {
		return (int) democratic;
	}

	public void setDemocratic(long l) {
		this.democratic = l;
	}

	public int getRepublican() {
		return republican;
	}

	public void setRepublican(long l) {
		this.republican = (int) l;
	}

	public int getElectoral() {
		return electoral;
	}

	public void setElectoral(int electoral) {
		this.electoral = electoral;
	}


}
