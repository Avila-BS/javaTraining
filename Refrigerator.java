class Refrigerator{
	String model;
	String company;
	int capacityInLitres;
	boolean doubleDoor;
	
	Refrigerator(String model,String company,int capacityInLitres,boolean doubleDoor)
	{
		this.model=model;
		this.company=company;
		this.capacityInLitres=capacityInLitres;
		this.doubleDoor=doubleDoor;
		System.out.println("invoked cons location String,String,int,boolean");
		
	}
	
	String getModel()
	{
		String model="Star Smart";
		this.model=model;
		return this.model;
	}
	String getCompany()
	{
		return this.company;
	}
	int getCapacityInLitres()
	{
		return this.capacityInLitres;
	}
	boolean getDoubleDoor()
	{
		return this.doubleDoor;
	}
	void setModel(String model)
	{
		this.model=model;
	}
	void setCompany(String company)
	{
		this.company=company;
	}
	void setCapacityInLitres(int capacityInLitres)
	{
		this.capacityInLitres=capacityInLitres;
	}
	void setDoubleDoor(boolean type)
	{
		this.doubleDoor=type;
	}
}