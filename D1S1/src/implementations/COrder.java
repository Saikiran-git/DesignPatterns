package implementations;

import interfaces.IOrder;

public class COrder implements IOrder
{

	@Override
	public void ProcessOrder(String modelName) 
	{
		System.out.println(modelName+" order accepted!");
	}
	
}
