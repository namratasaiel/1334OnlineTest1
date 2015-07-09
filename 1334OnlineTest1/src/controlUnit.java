import java.util.ArrayList;


public class controlUnit {
	
	Culamp onlamp=new Culamp();
	BusyLamp busylamp=new BusyLamp();
	BallotButton ballotbutton=new BallotButton();
	ArrayList candidate=new ArrayList<Candidate>();
	private void addCandidate(Candidate c){
		
  candidate.add(c);
		
	}
	
	private void getCandidates(){
		
		
	}
	
	private void clickBallotButton(){
		boolean status;
	  status= ballotbutton.click();
	  if(status==true){
		  busylamp.glowOn();
		  }

		
	}
}
