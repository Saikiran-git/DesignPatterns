package AbstractFactory;

public abstract class Order 
{
	public String channel,productType;
	
	public abstract void processOrder(String channel, String productType);
}
