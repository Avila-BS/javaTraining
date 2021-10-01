class Movie{
public static void entertain(int ticketPrice,float movieLength,String movieName,float rating,String[] actors)
{
	System.out.println("Invoked entertain");
	System.out.println("ticket Price-"+ticketPrice);
	System.out.println("Length of the movie in hours:"+movieLength);
	System.out.println("Name of the movie:"+movieName);
	//rating=8.5f;
	System.out.println("Rating of the movie:"+rating);
	System.out.println("Actors in the movie:");
	for(int actorIndex=0;actorIndex<actors.length;actorIndex++)
	{
		String actor=actors[actorIndex];
		System.out.println(actor);
	}
}
}