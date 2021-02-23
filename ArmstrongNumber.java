class ArmstrongNumber
{
public static void main(String...s)
{
System.out.println("Enter a Number.");
int num=new java.util.Scanner(System.in).nextInt();
int n=num;
int cube,r,sum=0;
while(num!=0){
r=num%10;
cube=r*r*r;
sum=sum+cube;
num=num/10;
}
if(sum==n)
System.out.println(n+"is an ArmstrongNumber.");
else
System.out.println(n+"is not an ArmstronNumber.");

}
}