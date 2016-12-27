package Election_Observable;

	
		public class Program_Main {

			public static void main(String[] args){
				State[] states=new State[5];
				
				states[0]=new State("NEW_YORK",4143874,2640570,29);
				states[1]=new State("TEXAS",3867816,4681590,38);
				states[2]=new State("KANSA", 537753,511319,6);
				states[3]=new State("CALIFORNIA", 7362490,3916209,55);
				states[4]=new State("FLORIDA",2771984,2317001,18);
				
				NumberOfVotes observable=new NumberOfVotes(states);
				
				
				VotingReport observer=new ObsRepublican(observable);
				
				observer=new ObsDemocrat(observable);
				
				observer=new ObsRepElectoral(observable);
				
				observer=new ObsDemPopularVote(observable);
				
				observer=new ObsHonestVote(observable);
			
				observable.setStates(states);
				
				}

	}


