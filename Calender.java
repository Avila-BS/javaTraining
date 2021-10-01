class Calender{
public static int getBirthMonth(String personName)
{
	if(personName=="Avila" )
	{
		System.out.println("birth month invoked");
		int month=7;
		return month;
	}
	else if(personName=="Akshala")
	{
		System.out.println("birth month invoked");
		int month1=2;
		return month1;
	}
	else
	{
		System.out.println("Birth month not found");
		return 0;
	}
}
public static String getBirthDay(String personName)
{
	if(personName=="AVILA")
	{
	System.out.println("Birth day invoked");
	String day="Monday";
	return day;
	}
	else if(personName=="Akshala")
	{
		System.out.println("Birth day invoked");
		String day1="Friday";
		return day1;
	}
	else
	{
	System.out.println("name not found");
String day2="day not found";
return day2;	
	}
}
}