class Scooter{
String brand;
float price;
float cc;
String fuel;
String tyre;
String color;
float weight;
float speed;
int tensileStrength;
float density;
int elongation;
float failureLimit;
String frame;
int durability;
String weldability;

Scooter(String brand,float price,float cc,String fuel,String tyre)
{
	System.out.println("invoked");
	this.brand=brand;
	this.price=price;
	this.cc=cc;
	this.fuel=fuel;
	this.tyre=tyre;
}
Scooter(String color,float weight,float speed,int tensileStrength,float density)
{
	this.color=color;
	this.weight=weight;
	this.speed=speed;
	this.tensileStrength=tensileStrength;
	this.density=density;
}
Scooter(int elongation,float failureLimit,String frame)
{
	this.elongation=elongation;
	this.failureLimit=failureLimit;
	this.frame=frame;
}
Scooter(int durability)
{
	this.durability=durability;
}
Scooter(String weldability)
{
	this.weldability=weldability;
}

}