
public class Context {
	private State state;
	
	
	public Context(){
		this.state=new On();
		
	}
	
	
	public void changeState(){
		
		state.changeState(this);
		
	}


	public State getState() {
		return state;
	}


	public void setState(State state) {
		this.state = state;
	}
	
	
	

}
