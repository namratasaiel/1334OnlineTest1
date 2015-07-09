
public class CandidateLamp implements Lamp {
	Context candidateLampc=new Context();

	@Override
	public Boolean glowOn() {
		State o=new On();
		candidateLampc.setState(o);	
		return true;
	}

	@Override
	public Boolean glowOff() {
		State o=new Off();
	candidateLampc.setState(o);		
		return false;
	}
		
	}


