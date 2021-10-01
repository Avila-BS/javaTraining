class BikeRunner{
public static void main(String[] values)
{
	int speed=19;
	Bike.brake(speed);
	Bike.start();
	boolean stateOfStart=Bike.start();
	System.out.println(stateOfStart);
	int speedd=50;
	Bike.currentSpeed(speedd);
	int value=Bike.currentSpeed(speedd);
	System.out.println(value);
	
}
}