class WatchStarter{
	public static void main(String[] args)
	{
		Watch watch=new Watch();
		watch.displayDetails();
		watch.type=WatchType.SOLARPOWERED;
		watch.countryMade="GERMANY";
		watch.displayDetails();
		
		
	}
}