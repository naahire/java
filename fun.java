public class fun{
//Function Overloading
int a=0,b=0;
void add(){
System.out.println("Addition is ="+(a+b));
}
void add(int x){
System.out.println("Addition is ="+(a+b+x));
}
void add(int x,int y){
System.out.println("Addition is ="+(x+y));
}
void add(int x,int y,int z){
System.out.println("Addition is ="+(x+y+z));
}

public static void main(String[] args){
fun f=new fun();
f.add();
f.add(5);
f.add(5,7);
f.add(5,7,9);
}
}