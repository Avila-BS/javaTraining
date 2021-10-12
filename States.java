class States{
	StateName name=StateName.KARNATAKA;
	String capital;
	int noOfDistricts;
	float temperature;
	int population;
	
	States(String capital,int noOfDistricts)
	{
		this();
		System.out.println("Invoked cons location String and int");
		this.noOfDistricts=noOfDistricts;
	
	}
	States()
	{
		System.out.println("Invoked Constructor with no args");
		this.capital="Banglore";
		this.noOfDistricts=30;
	}
	
	States(int population,float temperature,StateName name)
	{
		this("Trivandrum",24.3f,15,4460000);
		System.out.println("Invoked cons location int float and StateName");
		this.population=population;
		this.temperature=temperature;
		this.name=name;
	}
	
	States(String capital,float temperature,int noOfDistricts,int population)
	{
		System.out.println("Invoked cons location String,float,int,int ");
		this.capital=capital;
		this.temperature=temperature;
		this.noOfDistricts=noOfDistricts;
		this.population=population;
	}
	
	
	
}