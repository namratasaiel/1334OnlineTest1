import java.util.ArrayList;


public class BallotUnit {
 ReadyLamp readyLight=new ReadyLamp();
	boolean powerStatus;
	CandidateLamp candidateLamp=new CandidateLamp();
	CandidatesButton candidatesbutton=new CandidatesButton();
controlUnit cu=new controlUnit();

private Boolean readyForVote(){
	if(cu.busylamp.glowOn()){
		powerStatus=true;
		
	}
	return powerStatus;
	
}
	
	public Boolean onclickCandidateButton(){
		candidateLamp.glowOn();
		cu.busylamp.glowOff();
		return true;
		
	}

	
}
