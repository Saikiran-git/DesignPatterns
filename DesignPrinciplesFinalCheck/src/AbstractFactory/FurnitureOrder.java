package AbstractFactory;

public class FurnitureOrder extends Order{

	@Override
	public void processOrder(String channel,String productType) {
		System.out.println("Processing "+productType+" order through "+channel);
	}

}
