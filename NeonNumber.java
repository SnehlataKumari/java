class NeonNumber
{
public static void main(String args[])
{
System.out.println("ENTER A NUMBER.");
int num=new java.util.Scanner(System.in).nextInt();
int n=num;
int r,sqr,sum=0;
num=num*num;
while(num!=0)
{
r=num%10;
sum=sum+r;
num=num/10;
}
if(sum==n)
System.out.println(n+"is a NEON number.");
else
System.out.println(n+"is not aNEON number.");
}
}