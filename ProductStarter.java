class ProductStarter{
	public static void main(String[] food)
	{
		Product product=new Product(45.0f,2,"Dove Soap");
		product.displayDetails();
		product.displayTotalPrice();
		Product product1=new Product(20.25f,1,"Lux Soap");
		product1.isiMark=true;
		product1.displayDetails();
		product1.displayTotalPrice();
		Product product2=new Product(25.0f,4,"Pears");
		product2.displayDetails();
		product2.displayTotalPrice();
		Product product3=new Product(40.0f,3,"Himalaya");
		product3.displayTotalPrice();
		Product product4=new Product(50.0f,5,"Medimix");
		product4.displayTotalPrice();
	}

}