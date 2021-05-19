
public class MovableAdapterImpl implements MovableAdapter {

	private Movable luxuryCars;

	public MovableAdapterImpl() {
		super();
	}
	
	public MovableAdapterImpl(Movable bugattiVeyron) {
		luxuryCars=new BuggatiVeyron();
	}


	@Override
	public double getSpeed() {
		return convertMPHtoKMPH(luxuryCars.getSpeed());
	}

	private double convertMPHtoKMPH(double mph) {
		return mph * 1.60934;
	}
	
	private double convertUSDtoEURO(double usd) {
		return usd *  0.837776;
	}

	@Override
	public double getPrice() {
		return convertUSDtoEURO(luxuryCars.getPrice());
	}
}
