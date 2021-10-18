class RefrigeratorStarter{
public static void main(String[] cloud)
{
	Refrigerator fridge=new Refrigerator("5 star","Whirlpool",215,true);
	String model=fridge.getModel();
	String company=fridge.getCompany();
	int capacity=fridge.getCapacityInLitres();
	boolean door=fridge.getDoubleDoor();
	if(model!=null)
	{
		System.out.println(model);
	}
	if(company!=null)
	{
		System.out.println(company);
	}
	if(capacity>0)
	{
		System.out.println(capacity);
	}
	System.out.println(door);
	
	fridge.setModel("Star Inverter direct cool");
	fridge.setCompany("Samsung");
	fridge.setCapacityInLitres(190);
	fridge.setDoubleDoor(false);
	System.out.println(fridge.getModel());
	System.out.println(fridge.getCompany());
	System.out.println(fridge.getCapacityInLitres());
	System.out.println(fridge.getDoubleDoor());
	
	Refrigerator fridge2=new Refrigerator("Direct Cool","Godrej",260,true);
	String model2=fridge2.getModel();
	String company2=fridge2.getCompany();
	int capacity2=fridge2.getCapacityInLitres();
	boolean door2=fridge2.getDoubleDoor();
	if(model2!=null)
	{
		System.out.println(model2);
	}
	if(company2!=null)
	{
		System.out.println(company2);
	}
	if(capacity2>0)
	{
		System.out.println(capacity2);
	}
	System.out.println(door2);
	
	fridge2.setModel("Smart Inverter direct cool");
	fridge2.setCompany("Haier");
	fridge2.setCapacityInLitres(570);
	fridge2.setDoubleDoor(false);
	System.out.println(fridge2.getModel());
	System.out.println(fridge2.getCompany());
	System.out.println(fridge2.getCapacityInLitres());
	System.out.println(fridge2.getDoubleDoor());
	
}
}