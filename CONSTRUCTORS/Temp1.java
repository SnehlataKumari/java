class Temp1{
int x;
int y;
Temp1(){
x=10;
y=20;

}
void show(){
	System.out.println(x);
	System.out.println(y);
}
public static void main(String...s){
	Temp1 t1=new Temp1();
	t1.show();
	Temp1 t2=new Temp1();
	t2.show();
	System.out.println(t1);
	System.out.println(t2);
}
}