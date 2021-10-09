class MonitorStarter{
public static void main(String[] juice)
{
	Monitor monitor=new Monitor("Hp",52.35f,"curved");
	Monitor mon=new Monitor("horizontal","black",50,5,1080);
	Monitor tue=new Monitor("HD","input",1049,10);
	Monitor wed=new Monitor("led",2);
	Monitor thur=new Monitor(16.50f);
	System.out.println(monitor.company);
	System.out.println(monitor.price);
	System.out.println(monitor.shape);
	System.out.println(mon.position);
	System.out.println(mon.color);
	System.out.println(mon.frequency);
	System.out.println(mon.responseTime);
	System.out.println(mon.resolution);
	System.out.println(tue.mode);
	System.out.println(tue.use);
	System.out.println(tue.size);
	System.out.println(tue.bitDepth);
	System.out.println(wed.type);
	System.out.println(wed.refreshRate);
	System.out.println(thur.bandwidth);
	
}
}