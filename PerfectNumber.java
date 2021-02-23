class PerfectNumber
{
public static void main(String args[])
{
System.out.println("ENTER A NUMBER.");
int num=new java.util.Scanner(System.in).nextInt();
int n=num;
int sum=0;
for(int i=1;i<num;i++)
{
if(num%i==0)
{
sum=sum+i;
}
}
if(sum==n)
System.out.println(n+" is a PERFECT NUMBER.");
else

System.out.println(n+" is not a PERFECT NUMBER.");
}
}