class Developer
{
public static void writeCode()
{
System.out.println("writecode invoked");
debug();
Manager.planning();
}
public static void developApplication()
{
System.out.println("Application development invoked");
}
public static void compile()
{
System.out.println("Compilation invoked");
}
public static void run()
{
System.out.println("running invoked");
Manager.organizing();
}
public static void testing()
{
System.out.println("testing invoked");
}
public static void debug()
{
System.out.println("debugging invoked");
}
}