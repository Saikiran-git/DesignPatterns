package AbstractFactory;

public class OrderFactory {

	public static Order makeOrder(String channel,String productType)
	{
		Order order;
		if(productType.equalsIgnoreCase("Furniture"))
		{
			order = new FurnitureOrder();
			order.processOrder(channel, productType);
			return order;
		}
		else if(productType.equalsIgnoreCase("Electronic"))
		{
			order = new ElectronicOrder();
			order.processOrder(channel, productType);
			return order;
		}
		else
		{
			order = new ToysOrder();
			order.processOrder(channel, productType);
			return order;
		}
	}
}
