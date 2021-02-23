public class CompareToIgnoreCase{
	public static void main(String...s){
		String s1="Strings are immutable";
		String s2="strings are immutable";
		String s3="integers are not immutable";
		int result1=s1.compareTo(s2);
		System.out.println("compare to="+result1);
		int result2=s1.compareToIgnoreCase(s3);
		System.out.println("CompareToIgnoreCase"+result2);
		result2=s2.compareToIgnoreCase(s1);
		System.out.println("compare to="+result2);
	}
}