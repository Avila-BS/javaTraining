class SpeakerrRunner{
public static void main(String[] run)
{
	int levell=9;
	Speakerr.volume(levell);
	String spkr=Speakerr.volume(levell);
	System.out.println(spkr);
	Speakerr.turnOn();
	boolean type=Speakerr.turnOn();
	System.out.println(type);
	Speakerr.turnOff();
	boolean check=Speakerr.turnOff();
	System.out.println(check);
}
}