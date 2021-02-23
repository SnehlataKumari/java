class AutomorphicNumber
{
public static void main(String...s){
System.out.println("ENTER A NUMBER.");
int num=new java.util.Scanner(System.in).nextInt();
int n=num;
int sqr=0,r=0,c;
sqr=num*num;
if(num >=10){
r=sqr%100;
}

else
if(num <=10){
r=sqr%10;
}




if(r==n)
System.out.println(n+" is a Automorphic Number.");
else
System.out.println(n+" is not a Automorphic Number.");

}
}