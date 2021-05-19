import static org.junit.Assert.assertEquals;


public class Test {

	@org.junit.Test
	public void whenConvertingMPHToKMPH_thenSuccessfullyConverted() {
	 Movable bugattiVeyron = new BuggatiVeyron();
	 MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);

	 assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001);
	}
	
	@org.junit.Test
	public void whenConvertingUSDToEURO_thenSuccessfullyConverted() {
	 Movable bugattiVeyron = new BuggatiVeyron();
	 MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);

	 assertEquals(bugattiVeyronAdapter.getPrice(),753998.4 , 0.00001);
	}
}
