class Cameraa{
String brand;
String model;
float price;
float pixel;
boolean fourK;

Camera(String brand,String model,float price,float pixel,boolean fourK)
{
	System.out.println("invoked cons location String,String,float,int,boolean");
	this.brand=brand;
	this.model=model;
	this.price=price;
	this.pixel=pixel;
	this.fourK=fourK;
	
}

String getBrand()
{
	System.out.println("invoked getBrand ");
	return this.brand;
}
String getModel()
{
	return this.model;
}
float getPrice()
{
	return this.price;
}
float getPixel()
{
	return this.pixel;
	
}
boolean getFourK()
{
	return this.fourK;
	
}
String setBrand(String brand)
{
	this.brand=brand;
	return this.brand;
}
float setPrice(float price)
{
	this.price=price;
	return this.price;
}

}