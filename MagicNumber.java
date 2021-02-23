class MagicNumber
{
public static void main(String args[]){
System.out.println("ENTER A NUMBER.");
int num=new java.util.Scanner(System.in).nextInt();
int m=num;
int s;
int p=0;

int i=0, r,sum=0;
while(num!=0)
{
r=num%10;


sum=sum+r;
num=num/10;
}
if(sum>=10)
{
s=sum%10;
p=p+s;
}
if(p==1)

System.out.println(m+" is a Magic Number.");
else
System.out.println(m+" is not a Magic Number.");
}
}