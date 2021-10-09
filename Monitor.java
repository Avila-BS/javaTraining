class Monitor{
	String company;
	float price;
	String shape;
	String position;
	String color;
	int frequency;
	int responseTime;
	int resolution;
	String mode;
	String use;
	int size;
	int bitDepth;
	String type;
	int refreshRate;
	float bandwidth;
	
	Monitor(String company,float cost,String shape)
	{
		System.out.println("invoked const location String float string");
		this.company=company;
		price=cost;
		this.shape=shape;
	}
	Monitor(String position,String color,int frequency,int responseTime,int resolution)
	{
		System.out.println("invoked const location string string int int");
		this.position=position;
		this.color=color;
		this.frequency=frequency;
		this.responseTime=responseTime;
		this.resolution=resolution;
	}
	Monitor(String mode,String use,int size,int bitDepth)
	{
		System.out.println("invoked");
		this.mode=mode;
		this.use=use;
		this.size=size;
		this.bitDepth=bitDepth;
	}
	Monitor(String type,int refreshRate)
	{
		System.out.println("invoked");
		this.type=type;
		this.refreshRate=refreshRate;	
	}
	Monitor(float bandwidth)
	{
		System.out.println("invoked");
		this.bandwidth=bandwidth;
	}
	
}