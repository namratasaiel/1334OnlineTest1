
public class Culamp  implements  Lamp{

	Context culampc=new Context();
	@Override
	public void glowOn() {
		State o=new On();
		culampc.setState(o);		
	}

	@Override
	public void glowOff() {
		State o=new Off();
		culampc.setState(o);		
		
	}

	}


