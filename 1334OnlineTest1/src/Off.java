
public class Off extends State{

	public Off(){
		
		this.stateName="Off";
		
	}
	
	@Override
	public String changeState(Context c) {
		// TODO Auto-generated method stub
		State o=new On();
		c.setState(o);
		
		return o.getStateName();
		
		
	}

}
