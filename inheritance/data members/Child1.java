class Child1 extends Base1{
int x=20;
void show(){
	System.out.println(x);
	System.out.println(super.x);
	System.out.println(((Dadaji)this).x);	
}
public static void main(String...s){
	Child1 c1=new Child1();
c1.show();

}

}