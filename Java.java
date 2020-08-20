class vehicle {}
public class car extends vehicle
{
public static void main(String args[])
{
vehicle a=new car();
boolean result=a instanceof car;
System.out.println(result);
}
}