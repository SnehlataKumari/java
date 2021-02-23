class Chain{
public static void main(String arga[]){
new Chain();
}
Chain(){
	this(10);
	System.out.println("default");
}
Chain(int x){
	this(20,30);
	System.out.println(x);
}
Chain(int x,int y){
	
	System.out.println(x+y);
}

}