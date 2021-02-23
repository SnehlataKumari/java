class Format{
	public static void main(String args[]){
		float f=12.3f;
		int i=23;
		String s="hindustan";
		System.out.printf("the value of float is=%f,the value of integer is =%d,the value of string is=%s",f,i,s);
		String fs=String.format("the value of float is=%f,the value of integer is =%d,the value of string is=%s",f,i,s);
		System.out.printf("");
		System.out.printf(fs);
		//System.out.println("the value of float is=%f,the value of integer is =%d,the value of string is=%s",f,i,s);
		System.out.println(fs);
	}
}