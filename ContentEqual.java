class ContentEqual{
	public static void main(String args[]){
		String s1="NOT immutable";
		String s2="Strings are NOT immutable";
		StringBuffer s3=new StringBuffer("NOT immutable");
		boolean r=s1.contentEquals(s3);
		System.out.println(r);
		r=s2.contentEquals(s3);
		System.out.println(r);
		r=s1.contentEquals(s2);
		System.out.println(r);
	}
}