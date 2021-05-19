package AbstractFactory;

public class ElectronicOrder extends Order{

	@Override
	public void processOrder(String channel,String productType) {
		System.out.println("Processing "+productType+" order through "+channel);
	}

}
