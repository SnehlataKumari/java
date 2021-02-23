public class Array3{
	int z[];
	public static void main(String args[]){
		System.out.println("Enter The Size Of array.");
		int x=new java.util.Scanner(System.in).nextInt();
		Array3 obj1=new Array3();
		obj1.z=new int[x];
		System.out.println("Enter The Value Of array.");
		for(int i=0;i<obj1.z. length;i++){
			obj1.z[i]=new java.util.Scanner(System.in).nextInt();
			}
		System.out.println("The Max Value Of array is.");
		
		
		 int max = getMax(obj1.z);
			for(int i=1;i<obj1.z.length;i++){
				int m = getMax(obj1.z);
				if(max<m){
					max = m;
					
				}
			}
			System.out.println(max);
	}
 private static int getMax(int z[]){
						int max= z[0];
						for(int i=1;i<z.length;i++){
							if(max<z[i]){
								max=z[i];
							}
						}
					return max;	
						
					}
				
				
			
	
	
 }