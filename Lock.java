class Lock{
	void open(int price)
	{
		System.out.println("invoked open");
		System.out.println(price);
	}
	void close()
	{
		System.out.println("invoked close");
	}
}