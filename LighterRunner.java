class LighterRunner{
public static void main(String[] args)
{
	boolean status=Lighter.on();
	System.out.println(status);
	boolean nxtStatus=Lighter.off();
	System.out.println(nxtStatus);
	int wid=7;
	boolean size= Lighter.light(wid);
	System.out.println(size);
}

}