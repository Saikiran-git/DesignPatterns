package implementations;

import interfaces.IPhoneRepair;

public class CPhoneRepair implements IPhoneRepair 
{

	@Override
	public void ProcessPhoneRepair(String modelName) {
		
		System.out.println(modelName+" repair accepted!");
	}

}
