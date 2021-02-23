class KrishnamurtiNumber
{
public static void main(String args[])
{
System.out.println("ENTER A NUMBER.");
int num=new java.util.Scanner(System.in).nextInt();
int n=num;
int r,sum=0,f=1;
while(num!=0){
r=num%10;
for(int i=1;i<=r;i++)
{
 f=f*i;

}
sum=sum+f;
num=num/10;
f=1;

}
if(sum==n)
System.out.println(n+" is a KRISHNAMURTI NUMBER.");
else

System.out.println(n+" is not a KRISHNAMURTI NUMBER.");
}
}