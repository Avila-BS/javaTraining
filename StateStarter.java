class StateStarter{
	public static void main(String[] data)
	{
	States state=new States("Bengaluru",31);
    System.out.println(state.temperature);
	System.out.println(state.name);
	System.out.println(state.capital);
	System.out.println(state.population);
	System.out.println(state.noOfDistricts);
	
	state.temperature=29.6f;
	float temp=state.temperature;
	System.out.println(temp);
	
	States next=new States();
	System.out.println(next.capital);
	System.out.println(next.noOfDistricts);
	System.out.println(next.name);
	
	States another=new States(64800000,25.4f,StateName.KERALA);
	System.out.println(another.name);
	System.out.println(another.temperature);
	System.out.println(another.population);
	System.out.println(another.noOfDistricts);
	System.out.println(another.capital);
	
	States stat=new States("Trivandrum",25.4f,16,456765);
	System.out.println(stat.population);
	System.out.println(stat.capital);
	System.out.println(stat.temperature);
	System.out.println(stat.noOfDistricts);
	stat.name=StateName.TAMILNADU;
	System.out.println(stat.name);
	
	

	}
	
}