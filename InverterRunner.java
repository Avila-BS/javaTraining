class InverterRunner{
	public static void main(String[] values)
	{
		Inverter inv=new Inverter();
		System.out.println(inv.make);
		System.out.println(inv.price);
		System.out.println(inv.capacity);
		System.out.println(inv.color);
		System.out.println(inv.weight);
		
		inv.make="Luminous";
		inv.price=10000;
		inv.color="black";
		
		System.out.println(inv.make);
		System.out.println(inv.price);
		System.out.println(inv.capacity);
		System.out.println(inv.color);
		System.out.println(inv.weight);
		
		
	}
}