class ScooterStarter{
public static void main(String[] pasta)
{
	Scooter one=new Scooter("honda",56799.99f,87.8f,"petrol","tube");
	Scooter two=new Scooter("Silver",95.0f,93.84f,300,7.85f);
	Scooter three=new Scooter(26,0.5f,"core");
	Scooter four=new Scooter(163);
	Scooter five=new Scooter("Strong");
	System.out.println(one.brand);
	System.out.println(one.price);
	System.out.println(one.cc);
	System.out.println(one.fuel);
	System.out.println(one.tyre);
	System.out.println(two.color);
	System.out.println(two.weight);
	System.out.println(two.speed);
	System.out.println(two.tensileStrength);
	System.out.println(two.density);
	System.out.println(three.elongation);
	System.out.println(three.failureLimit);
	System.out.println(three.frame);
	System.out.println(four.durability);
	System.out.println(five.weldability);
}
}