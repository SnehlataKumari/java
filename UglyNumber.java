class UglyNumber
{
public static void main(String...s)
{
System.out.println("ENTER A NUMBER.");
int num=new java.util.Scanner(System.in).nextInt();
int n=num;
if(num%2==0||num%3==0||num%5==0)
System.out.println(n+" is an UGLY NUMBER.");
else
System.out.println(n+" is not an UGLYNUMBER.");
}
}