class CalenderRunner{
public static void main(String[] cal)
{
	String name="Avila";
	Calender.getBirthMonth(name);
	int birth=Calender.getBirthMonth(name);
	System.out.println(birth);
	String value="Akshala";
	Calender.getBirthDay(value);
	String result=Calender.getBirthDay(value);
	System.out.println(result);
}
}