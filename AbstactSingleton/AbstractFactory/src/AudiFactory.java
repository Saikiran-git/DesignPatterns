
public class AudiFactory extends Factory{

	@Override
	public Headlight makeHeadlight() {
		Headlight headlight=new AudiHeadlight();
		return headlight;
	}

	@Override
	public Tire makeTire() {
		Tire tire=new AudiTire();
		return tire;
	}

}
