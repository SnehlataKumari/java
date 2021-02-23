class Endswith{
	public static void main(String args[]){
		String s="tis is immutable!!.";
		boolean r;
		r=s.endsWith("immutable!!.");
		System.out.println(r);
		r=s.endsWith("immutable!!");
		System.out.println(r);
		r=s.endsWith("table");
		System.out.println(r);
	}
}