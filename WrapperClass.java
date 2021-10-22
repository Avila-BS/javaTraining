class WrapperClass{
	public static void main(String[] work)
	{
		//Constructors using Byte class
		
		byte birthDate=12;
		Byte value=new Byte(birthDate);
        System.out.println(value);
		
    String name1="127";
	Byte result=new Byte(name1);
	System.out.println(result);
	
	//byte methods
	
	byte date=value.byteValue();
	System.out.println(date);
	
	byte tokenNo=12;
	byte slNo=7;
	int dif=Byte.compare(tokenNo,slNo);
	System.out.println(dif);
	
	int comparedTo=value.compareTo(tokenNo);
	System.out.println(comparedTo);
	
	String year="65";
	byte decodee=Byte.decode(year);
	System.out.println(decodee);
	
	Double obj = new Double("10.35");
	double doubleValuee=obj.doubleValue();
	System.out.println(doubleValuee);
	
	boolean equal=result.equals(doubleValuee);
	System.out.println(equal);
	
	float no=15.2f;
	Float nmbr=new Float(no);
	float returnn=nmbr.floatValue();
	System.out.println(returnn);
	
	Integer rollNo=new Integer("25");
	int hashValue=rollNo.hashCode();
	System.out.println(hashValue);
	
	String gen="10";
	Byte conv=new Byte(gen);
	int op=conv.hashCode();
	System.out.println(op);
	
	Integer time=new Integer(11);
	int tym=time.intValue();
	System.out.println(tym);
	
	//short constructors
	short cost=15000;
	Short price=new Short(cost);
	System.out.println(price);
	
	Short exm=new Short(name1);
	System.out.println(exm);
	
	//short methods
	
	byte next=time.byteValue();
	System.out.println(next);
	
	int comp=Short.compare(cost,exm);
	System.out.println(comp);
	
	int another=price.compareTo(exm);
	System.out.println(another);
	
	Short level=Short.decode(name1);
	System.out.println(level);
	
	Double set=new Double("16.5456");
	double ret=set.doubleValue();
	System.out.println(ret);
	
	boolean check=price.equals(level);
	System.out.println(check);
	
	Float pi=new Float("3.14");
	float end=pi.floatValue();
	System.out.println(end);
	
	Long line=new Long("77898");
	long fin=line.longValue();
	System.out.println(line);
	
	String choc="75";
	short shortValue=Short.parseShort(choc);
	System.out.println(shortValue);
	
	
	short par=Short.parseShort(choc,8);
	System.out.println(par);
	
	//Integer Constructors
	Integer find=new Integer(another);
	System.out.println(find);
	
	Integer string1=new Integer(name1);
	System.out.println(string1);
	
	//Integer methods
	
	int n=16;
	String val=Integer.toBinaryString(16);
	System.out.println(val);
	int binary=Integer.bitCount(n);
	System.out.println(binary);
	
	Byte first=new Byte("41");
	byte one=first.byteValue();
	System.out.println(one);
	
	int cmp=Integer.compare(find,n);
	System.out.println(cmp);
	
	int save=find.compareTo(n);
	System.out.println(save);
	
	int unsign=Integer.compareUnsigned(cmp,save);
	System.out.println(unsign);
	
	int dec=Integer.decode(name1);
	System.out.println(dec);
	
	int div=Integer.divideUnsigned(55,5);
	System.out.println(div);
	
	String state="karnataka.state.kodagu.district";
	Integer why=Integer.getInteger(state);
	System.out.println(why);
	
	int high=Integer.highestOneBit(20);
	System.out.println(high);
	
	int low=Integer.lowestOneBit(20);
	System.out.println(low);
	
	//Long Constructors
	
	long pin=571218;
	Long code=new Long(pin);
	System.out.println(code);
	
	Long fan=new Long(name1);
	System.out.println(fan);
	
	//Long methods
	int bit=Integer.bitCount(n);
	System.out.println(bit);
	
	byte phone=first.byteValue();
	System.out.println(phone);
	
	int checkk=Long.compare(pin,656741);
	System.out.println(checkk);
	
	int lead=Long.numberOfLeadingZeros(pin);
	System.out.println(lead);
	
	long l=580;
	long rev=Long.reverse(l);
	System.out.println(rev);
	
	long revs=Long.reverseBytes(l);
	System.out.println(revs);
	
	long rotate=Long.rotateLeft(64,2);
	System.out.println(rotate);
	
	long right=Long.rotateRight(64,3);
	System.out.println(right);
	
	String bin=Long.toBinaryString(pin);
	System.out.println(bin);
	
	String hexa=Long.toHexString(pin);
	System.out.println(hexa);

  //Float Constructor	
	double lit=16.66557;
	Float light=new Float(lit);
	System.out.println(light);
	
	Float neww=new Float(17.98f);
	System.out.println(neww);
	
	Float box=new Float(name1);
	System.out.println(box);
	
	//Float methods
	
	byte cha=first.byteValue();
	System.out.println(cha);
	 
	float ad=Float.compare(12.12f,67.93f);
	System.out.println(ad);
	
	double fly=set.doubleValue();
	System.out.println(fly);
	
	boolean rite=neww.isInfinite();
	System.out.println(rite);
	
	boolean an=Float.isInfinite(12.1666666666666666666666f);
	System.out.println(an);
		
	float wrap=Float.parseFloat(name1);
	System.out.println(wrap);
	
	String toStringg=Float.toString(23.26f);
	System.out.println(toStringg);
	
	float of=Float.valueOf(75.98f);
	System.out.println(of);
	
	float th=Float.valueOf(name1);
	System.out.println(th);
	
	Long git=new Long("675434");
	long cast=git.longValue();
	System.out.println(cast);
	
	//Double Constructors
	
	Double doub=new Double(16.66666655555);
	System.out.println(doub);
	
	Double fit=new Double(name1);
	System.out.println(fit);
	
	//Double Methods
	
    byte key=first.byteValue();
	System.out.println(key);
	
	int music=Double.compare(67.9999999999999999,23.677777777777777777);
	System.out.println(music);
	
	long raw=Double.doubleToRawLongBits(2.55);
	System.out.println(raw);
	
	long longg=Double.doubleToLongBits(7.88);
	System.out.println(longg);
	
	double d1=65.66;
	Double d2=new Double(d1/0);
	boolean infinite=Double.isInfinite(d2);
    System.out.println(infinite);
	
	
	boolean nan=d2.isNaN();
	System.out.println(nan);
	
	double add=Double.sum(34.10,34.20);
	System.out.println(add);
	
	double maxx=Double.max(49.96,68.54);
	System.out.println(maxx);
	
	double minn=Double.min(22.78,76.9999888);
	System.out.println(minn);
	
	double sis=Double.valueOf(name1);
	System.out.println(sis);
	
	//character constructors
	
    Character ch=new Character('a');
	System.out.println(ch);
	
	//Character methods
	
	int count=Character.charCount(97);
	System.out.println(count);
	
	char car=ch.charValue();
	System.out.println(car);
	
	char[] fruit={'m','a','n','g','o'};
	int sweet=Character.codePointAt(fruit,1);
	System.out.println(sweet);
	
	int bitt=Character.codePointAt(fruit,1,4);
	System.out.println(bitt);
	
	CharSequence seq="BreakFast";
	int sequence=Character.codePointAt(seq,3);
	System.out.println(sequence);
	
	int before=Character.codePointBefore(fruit,2);
	System.out.println(before);
	
	int point=Character.codePointCount(fruit,1,3);
	System.out.println(point);
	
	char say='m';
	int rad=Character.digit(say,2);
	System.out.println(rad);
	
	int numeric=Character.getNumericValue(say);
	System.out.println(numeric);
	
	int type=Character.getType(say);
	System.out.println(type);
	
	
	//boolean Constructors
	
	Boolean bool=new Boolean(true);
	System.out.println(bool);
	
	Boolean bat=new Boolean("white");
	System.out.println(bat);
	
	//boolean Methods
	
	boolean rain=bool.booleanValue();
	System.out.println(rain);
	
	boolean ticket=true;
	boolean man=true;
	int city=Boolean.compare(ticket,man);
	System.out.println(city);
	
	boolean logic=Boolean.logicalAnd(ticket,man);
    System.out.println(logic);
	
	boolean or=Boolean.logicalOr(ticket,man);
	System.out.println(or);
	
	boolean xor=Boolean.logicalXor(ticket,man);
	System.out.println(xor);
	
	String veg="potato";
	boolean vegetable=Boolean.parseBoolean(veg);
	System.out.println(vegetable);
	
	boolean stat=Boolean.valueOf(ticket);
	System.out.println(stat);
	
	Integer hash=new Integer("246");
	int hashh=hash.hashCode();
	System.out.println(hashh);
	
	int hit=Boolean.hashCode(man);
	System.out.println(hit);
	
	String last=veg.toString();
	System.out.println(last);
	
	
	
	
	}
}