class Child3 extends Base3{
	int x=30;
 void show(){
System.out.println("child");
}
void display(){
	System.out.println("display");
}
public static void main(String...a){
Base3 s=new Child3();
s.show();
System.out.println(s.x);
Child3 c=(Child3)s;
c.display();
System.out.println(s);
System.out.println(c);
}
}