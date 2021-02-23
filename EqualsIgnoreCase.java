class EqualsIgnoreCase{
	public static void main(String args[]){
	String s1=new String("this is really immutable.");
	String s2=s1;
	String s3="this is really immutable.";
	String s4="this is REALLY IMMUTABLE";
	boolean r;
	r=s2.equalsIgnoreCase(s3);
	System.out.println(r);
	r=s3.equalsIgnoreCase(s4);
	System.out.println(r);
	r=s1.equalsIgnoreCase(s3);
	System.out.println(r);
	
	}
}