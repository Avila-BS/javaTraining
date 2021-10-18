class CameraStarter{
public static void main(String[] rain)
{
	Cameraa cam=new Cameraa("SONY","ALPHA",53.990f,24.70f,true);
	String brand=cam.getBrand();
	String model=cam.getModel();
	float price=cam.getPrice();
	float pixel=cam.getPixel();
	boolean isFourK=cam.getFourK();
	if(brand!=null)
	{
		System.out.println(brand);
	}
	if(model!=null);
	{
		System.out.println(model);
	}
	if(price>0)
	{
		System.out.println(price);
	}
	if(pixel>0)
	{
		System.out.println(pixel);
	}
	System.out.println(isFourK);
	
	String brand1=cam.setBrand("Nikon");
	System.out.println(brand1);
	cam.setPrice(60.50f);
	System.out.println(cam.getBrand());
	System.out.println(cam.getPrice());
	
}
}