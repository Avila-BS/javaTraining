class MovieRunner{
public static void main(String[] mov)
{
int ticket=130;
float length=2.5f;
String name="Shershaah";
float rating=8.5f;
String[] actors={"Sidarth Malhotra","Kiara Advani","Ankita Goraya","Shiv Pandit","Sahil Vaid"};
Movie.entertain(ticket,length,name,rating,actors);
System.out.println("==================");
int ticket2=200;
float length2=3.00f;
String name2="Saina";
float rating2=3.50f;
String[] actors2={"Parineeti Chopra","Paresh Rawal","Manav Kaul","Meghna Malik","Ankur Vikal","Shubraojyoti Barat"};
Movie.entertain(ticket2,length2,name2,rating2,actors2);
}
}