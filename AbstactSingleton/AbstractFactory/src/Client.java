
public class Client 
{
	public static void main(String[] args) {
		
		
		//Testing The Audi methods
		Factory audiFactory=Factory.getFactoryType("AUDI");
		Headlight audiHeadlight=audiFactory.makeHeadlight();
		Tire audiTire=audiFactory.makeTire();
		
		//Testing The Mercedes methods
		Factory mercedesFactory=Factory.getFactoryType("MERCEDES");
		Headlight mercedesHeadlight=mercedesFactory.makeHeadlight();
		Tire mercedesTire=mercedesFactory.makeTire();
	}
}
