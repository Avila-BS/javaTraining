class ClassRunner{
	public static void main(String[] args)
	{
		System.out.println("main invoked");
		Internet internet=new Internet();
		String pro=internet.provider;
		System.out.println(pro);
		System.out.println("=========================");
		
		Deodrant deo=new Deodrant();
		String brand=deo.brand;
		int cost=deo.price;
		float netWeight=deo.quantity;
		String col=deo.color;
		System.out.println(brand);
		System.out.println(cost);
		System.out.println(netWeight);
	    System.out.println(col);
		
		System.out.println("=========================");
		
		PowerBank power=new PowerBank();
		int storage=power.capacity;
		String company=power.company;
		float mrp=power.price;
		System.out.println(storage);
		System.out.println(company);
		System.out.println(mrp);
		
		System.out.println("=========================");
		
		Wallet wallet=new Wallet();
		int rate=wallet.price;
		String color=wallet.color;
		String country=wallet.countryMade;
		System.out.println(rate);
		System.out.println(color);
		System.out.println(country);
		
	}
}