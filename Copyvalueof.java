class Copyvalueof{
	public static void main(String args[]){
		char[] s1={'h','e','l','l','o','w','o','r','l','d'};
		String s="";
		s=String.copyValueOf(s1);
		System.out.println("returned value is"+s);
		s=String.copyValueOf(s1,2,6);
		System.out.println("result is"+s);
	}
}