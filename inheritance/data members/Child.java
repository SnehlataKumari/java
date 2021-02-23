class Child extends Base{
void get(int x,int y){
this.x=x;
this.y=y;
}
public static void main(String...s){
	Child c=new Child(10,20);
	//c.get(10,20);
	c.show();
}
}