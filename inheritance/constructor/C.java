class C extends B{
	C(){
		super();
		System.out.println("default");
	}
	C(int x){
		super();
	System.out.println(x);	
	}
	public static void main(String...d){
		new C();
		new C(12);
	}
	
}