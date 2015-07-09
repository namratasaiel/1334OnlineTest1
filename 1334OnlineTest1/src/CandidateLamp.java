
public class CandidateLamp implements Lamp {
	Context candidateLampc=new Context();

	@Override
	public void glowOn() {
		State o=new On();
		candidateLampc.setState(o);		
	}

	@Override
	public void glowOff() {
		State o=new Off();
	candidateLampc.setState(o);		
		
	}
		
	}


