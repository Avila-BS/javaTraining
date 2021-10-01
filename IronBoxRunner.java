class IronBoxRunner{
public static void main(String[] args)
{
String cloth="Cotton";
IronBox.heating(cloth);
IronBox.heating("Polyster");
boolean stream=true;
IronBox.streamWater(stream);
IronBox.streamWater(false);
}
}