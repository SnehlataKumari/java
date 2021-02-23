class HappyNo
{
public static void main (String...s);
{
int sqr,r,sum=0;

int num=new java.util.Scanner(System.in).nextInt();
System.out.println ("ENTER A NUMBER");
while(num!=0)

r=num%10;
sum=sum+r*r;
num=num/10;


 if(sum==1)

System.out.println ("the number is happy number.");


}
}

