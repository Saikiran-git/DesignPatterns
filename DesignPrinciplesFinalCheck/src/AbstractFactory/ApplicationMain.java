package AbstractFactory;

public class ApplicationMain 
{
	public static void main(String[] args) {
		
		OrderFactory.makeOrder("ECommerce", "Electronic");
		OrderFactory.makeOrder("Tele Caller", "Toys");
		OrderFactory.makeOrder("ECommerce", "Furniture");
	}
}
