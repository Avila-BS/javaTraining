class Product{
boolean quality=true;
float price;
int quantity;
boolean isiMark;
String name;
static double totalOfAllProduct;

Product(float price,int quantity,String name)
{
	System.out.println("invoked location cons float,price");
	this.price=price;
	this.quantity=quantity;
	this.name=name;
	
}

void displayDetails()
{
	System.out.println("invoked display details");
	System.out.println(this.quality);
	System.out.println(this.price);
	System.out.println(this.quantity);
	System.out.println(this.isiMark);
	System.out.println(this.name);
}
void displayTotalPrice()
{
	System.out.println("invoked display total price");
	double totalPrice=this.quantity*this.price;
	System.out.println(totalPrice);
	Product.totalOfAllProduct=Product.totalOfAllProduct+totalPrice;
	System.out.println(Product.totalOfAllProduct);
}
}