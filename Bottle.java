class Bottle{
public static void storing(int price,String color,int height,String quality,String[] brands)
{
	System.out.println("Invoked bottle");
	System.out.println("Bottle price:"+price);
	System.out.println("Color of the bottle : "+color);
	System.out.println("Height in inches : "+height);
	System.out.println("Quality of the bottle :"+quality);
	System.out.println("brands:");
	for(int indexBottle=0;indexBottle<brands.length;indexBottle++)
	{
		String bottle=brands[indexBottle];
		System.out.println(bottle);
	}
}
}