class Lighter{
public static boolean on()
{
System.out.println("on invoked");
boolean on=true;
if(on)
{
	System.out.println("Lighter is on");
	return true;
}
else
{
	System.out.println("Lighter is off");
	return false;
}
	
}
public static boolean off()
{
	System.out.println("off invoked");
	boolean off=true;
	if(off)
	{
		System.out.println("Lighter is off");
		return true;
	}
	else
	{
		System.out.println("Lighter is on");
		return false;
	}
}
public static boolean light(int width)
{
	System.out.println("Light invoked");
	if(width<=0)
	{
		System.out.println("width is less than 0");
		return false;
	}
	else
	{
		System.out.println("width is:"+width);
		return true;
	}
}
}