
public class On extends State {

	
	public On(){
		
		this.stateName="On";
		
	}
	
	@Override
	void changeState(Context c) {
		// TODO Auto-generated method stub
		State o=new Off();
		c.setState(o);
		
		System.out.println("The state Changed to "+o.getStateName());
		
	}

}
