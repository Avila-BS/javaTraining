class Stabilizer{
float voltage;
int current;
String brand;
float price;
int size;
String type;
String phase;
int toleration;
int powerRating;
float efficiency;
String color;
int frequency;
float powerFactor=0.8f;
int rating=5;
float weight;

Stabilizer(float voltage,int current,String brand)
{
	System.out.println("invoked cons location float int and String");
	System.out.println(this);
	this.voltage=voltage;
	this.current=current;
	this.brand=brand;
}
Stabilizer(String type,int size,float price)
{
System.out.println("invoked cons location string int and float");
this.type=type;
this.size=size;
this.price=price;	
}
Stabilizer(String phase,int toleration,int powerRating)
{
	System.out.println("invoked cons location string int and int");
	this.phase=phase;
	this.toleration=toleration;
	this.powerRating=powerRating;
}
Stabilizer(float efficiency,String color,int frequency)
{
	System.out.println("invoked cons location float string and int");
	this.efficiency=efficiency;
	this.color=color;
	this.frequency=frequency;
}
Stabilizer(float weight)
{
System.out.println("invoked cons location float ");	
this.weight=weight;
}
}