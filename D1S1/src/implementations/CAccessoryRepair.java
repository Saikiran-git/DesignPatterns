package implementations;

import interfaces.IAccessoryRepair;

public class CAccessoryRepair implements IAccessoryRepair 
{

	@Override
	public void ProcessAccessoryRepair(String accessoryType) {
		System.out.println( accessoryType+" repair accepted!");
		
	}

}
