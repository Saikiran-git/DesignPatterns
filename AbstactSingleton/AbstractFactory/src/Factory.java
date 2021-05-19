
public abstract class Factory 
{
	public abstract Headlight makeHeadlight();
	
	public abstract Tire makeTire();	
	
	public static Factory getFactoryType(String type)
	{
		if(type.equalsIgnoreCase("Audi"))
		{
			return new AudiFactory();
		}
		else
			return new MercedesFactory();
	}
}
