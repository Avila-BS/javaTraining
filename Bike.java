class Bike{
	public static void brake(int speed)
	{
		if(speed<20)
		{
			System.out.println("bike is stopped!!");
		}
		else{
			System.out.println("bike is not stopped!!");
			return;
		}
		System.out.println("end of brake");
		return;
	}
	public static boolean start()
	{
		System.out.println("Invoked start");
		boolean startt=false;
		return startt;
	}
	public static int currentSpeed(int speed)
	{
		System.out.println("Invoked current speed");
		System.out.println(speed);
		return speed;
		
	}
}