
public class MercedesFactory extends Factory
{
	@Override
	public Headlight makeHeadlight() {
		Headlight headlight=new MercedesHeadlight();
		return headlight;
	}

	@Override
	public Tire makeTire() {
		Tire tire=new MercedesTire();
		return tire;
	}
}
