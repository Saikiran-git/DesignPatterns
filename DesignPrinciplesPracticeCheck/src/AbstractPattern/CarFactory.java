package AbstractPattern;

public class CarFactory 
{
	public static Car buildCar(CarType carType,Location location)
	{
		Car car;
		if(carType.compareTo(CarType.LUXURY)==0)
		{
			car=new LuxuryCar(location);
			car.setLocation(location);
			car.setModel(carType);
		}
		else if(carType.compareTo(CarType.MINI)==0)
		{
			car=new MiniCar(location);
			car.setLocation(location);
			car.setModel(carType);
		}
		else
		{
			car=new MicroCar(location);
			car.setLocation(location);
			car.setModel(carType);
		}
		
		return car;
	}
}
