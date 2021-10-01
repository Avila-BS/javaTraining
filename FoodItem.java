class FoodItem{
public static String menu(String[] foodItems)
{
	System.out.println("menu invoked");
	int size=foodItems.length;
	for(int foodIndex=0;foodIndex<size;foodIndex++)
	{
		System.out.println(foodItems[foodIndex]);
	}
	System.out.println("========");
	return foodItems[0];
	
}
}