class Child2 extends Base2{
void show(){
	System.out.println("child");
	super.show();
	
}
public static void main (String []a){
Child2 s=new Child2();
s.show();

}
}