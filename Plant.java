class Plant{
public static void grow(String plantName)
{
System.out.println("grow invoked");
float height=6.1f;
System.out.println(height);
System.out.println(plantName);
}
public static void watering(int litre)
{
	System.out.println("watering invoked");
	System.out.println("Litres :"+litre);//concatenation
	boolean enough=false;
	System.out.println("enough :"+enough);
	
}
}