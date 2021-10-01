class Speakerr
{
public static String volume(int level)
{
	if(level<=0)
	{
		System.out.println("level zero invoked");
		String msg="On it first";
		return msg;
	}
    else if(level<=3)
	{
		System.out.println("level lesser than or equal to three is invoked");
		String message="loud";
		return message;
	}
	else if(level>3&&level<5)
	{
		System.out.println("level between three and five is invoked");
		String message1="too loud";
		return message1;
	}
	else if(level>=5&&level<9)
	{
		System.out.println("level bw four and nine is invoked ");
		String message2="too loud";
		return message2;
	}
	else
	{
		System.out.println("level greater than eight is invoked ");
		String message3="call police";
		return message3;
	}
}
public static boolean turnOn()
{
	System.out.println("turn on invoked");
	boolean turn=true;
	return turn;
}
public static boolean turnOff()
{
	System.out.println("turn off invoked");
	boolean off=false;
	return off; 
}
}