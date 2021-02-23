class HarshadNumber
{
public static void main(String args[])
{
System.out.println("ENTER A NUMBER.");
int num=new java.util.Scanner(System.in).nextInt();
int n=num;
int r,sum=0;
while(num!=0){
r=num%10;
sum=sum+r;
num=num/10;

}
if(n%sum==0)
System.out.println(n+" is a Harshad Number.");
else
System.out.println(n+" is not a Harshad Number.");
}
}