class Manager
{
public static void meeting()
{
System.out.println("meeting invoked");
Developer.writeCode();
Developer.developApplication();
Developer.compile();
decideSalary();
}
public static void monitor()
{
System.out.println("monitoring invoked");
Developer.testing();
}
public static void planning()
{
System.out.println("planning invoked");
}
public static void organizing()
{
System.out.println("organizing invoked");
}
public static void decideSalary()
{
System.out.println("decide Salary invoked");
}
}