
public class Culamp  implements  Lamp{

	Context culampc=new Context();
	@Override
	public Boolean glowOn() {
		State o=new On();
		culampc.setState(o);
		return true;
	}

	@Override
	public Boolean glowOff() {
		State o=new Off();
		culampc.setState(o);		
		return false;
	}

	}


