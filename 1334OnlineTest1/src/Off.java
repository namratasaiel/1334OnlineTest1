
public class Off extends State{

	public Off(){
		
		this.stateName="Off";
		
	}
	
	@Override
	public void changeState(Context c) {
		// TODO Auto-generated method stub
		State o=new On();
		c.setState(o);
		
		System.out.println("The state Changed to "+o.getStateName());
		
		
	}

}
