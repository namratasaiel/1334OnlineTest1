
public class BusyLamp implements Lamp{
	Context busyLampc=new Context();

		@Override
	public Boolean glowOn() {
		State o=new On();
		busyLampc.setState(o);	
		return true;
	}

	@Override
	public Boolean glowOff() {
		State o=new Off();
		busyLampc.setState(o);		
		return false;
	}

	

}
