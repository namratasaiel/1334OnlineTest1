
public class On extends State {

	
	public On(){
		
		this.stateName="On";
		
	}
	
	@Override
	 public String changeState(Context c) {
		// TODO Auto-generated method stub
		State o=new Off();
		c.setState(o);
		return o.getStateName();
		
	}

}
