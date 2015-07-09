
public class BusyLamp implements Lamp{
	Context busyLampc=new Context();

		@Override
	public void glowOn() {
		State o=new On();
		busyLampc.setState(o);		
	}

	@Override
	public void glowOff() {
		State o=new Off();
		busyLampc.setState(o);		
		
	}

	

}
