class BuzzNumber
{
public static void main(String args[])
{
System.out.println("ENTER A NUMBER.");
int num=new java.util.Scanner(System.in).nextInt();
int n=num;
int t=num;
int r=num%10;
int s=t%7;
if(r==7||s==0)
System.out.println(n+"is a BUZZ number.");
else
System.out.println(n+"is not a Buzz number.");
}
}