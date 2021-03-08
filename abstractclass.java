import java.util.*;
interface inter {
abstract void add();
}
class abs implements inter
{
int a,b,c;
public void add(){
Scanner s=new Scanner(System.in);
System.out.println("Enter The VAlue of First integer ");
a=s.nextInt();
System.out.println("Enter The VAlue of Second integer ");
b=s.nextInt();
c=a+b;
System.out.println("Addition is = "+c);
}
}
abstract class inter1 {
abstract void add1();
}
class abs1 extends inter1
{
int a1,b1,c1;
public void add1(){
Scanner s1=new Scanner(System.in);
System.out.println("Enter Abtract class First integer ");
a1=s1.nextInt();
System.out.println("Enter Abstract class Second integer ");
b1=s1.nextInt();
c1=a1+b1;
System.out.println("Addition of abstract class = "+c1);
}
}
public class abstractclass extends abs {
public static void main(String args[]){
inter a=new abs();
a.add();
inter1 a1=new abs1();
a1.add1();
}
}
