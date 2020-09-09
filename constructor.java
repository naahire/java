public class constructor{
int a,b;
constructor(){
//Default Constructor
}
constructor(int x,int y){
//Parameteraise Constructor
a=x;
b=y;
System.out.println("Addition is = "+(a+b));
System.out.println("Substraction is = "+(a-b));
System.out.println("Multiplication is = "+(a*b));
System.out.println("Division is = "+(a/b));
}
public static void main(String[] args){
constructor c=new constructor(3,4);
}
}