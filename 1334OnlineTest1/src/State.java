
public abstract class State {
	
	protected String stateName;
	
	abstract void changeState(Context c);
	
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

}
