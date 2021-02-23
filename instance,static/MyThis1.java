class MyThis1{
int x=10;
void get(int x,MyThis1 z){
	System.out.println(x);
	System.out.println(z.x);
	System.out.println(z);
}
public static void main(String...s){
	MyThis1 mt=new MyThis1();
	mt.get(20,mt);
	System.out.println(mt.x);
	System.out.println(mt);
	
}

}