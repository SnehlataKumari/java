class MyThis{
int x=100;
void get(MyThis this,int x){
	System.out.println(this+"get");
	System.out.println(this.x);
	System.out.println(x);
}
public static void main(String...s){
	MyThis mt=new MyThis();
	mt.get(300);
	System.out.println(mt+"main");
	System.out.println(mt);
	
}

}