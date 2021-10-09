class StabilizerStarter{
public static void main(String[] saturday)
{
	Stabilizer stab=new Stabilizer(220.0f,8,"V-Guard");
	System.out.println(stab.voltage);
	Stabilizer next=new Stabilizer("electromechanical",550,2298.99f);
	Stabilizer res=new Stabilizer("Single phase",20,50);
	Stabilizer out=new Stabilizer(80,"maroon",50);
	Stabilizer test=new Stabilizer(20.0f);
	System.out.println(stab.voltage);
    System.out.println(stab.current);
	System.out.println(stab.brand);
	System.out.println(next.type);
	System.out.println(next.size);
	System.out.println(next.price);
	System.out.println(res.phase);
	System.out.println(res.toleration);
	System.out.println(res.powerRating);
	System.out.println(out.efficiency);
	System.out.println(out.color);
	System.out.println(out.frequency);
	System.out.println(test.weight);
	System.out.println(test.rating);
	System.out.println(test.powerFactor);
	









	
}

}