import java.util.*;
public class Array1{
	
	public static void main(String args[]){
		// int z[];
		// System.out.println("ENTER THE SIZE OF ARRAY.");
		// int sizeOfArray = new Scanner(System.in).nextInt();
		// z = new int[sizeOfArray];
	
		// System.out.println("Enter Elements of array");
		
		// for(int i=0; i<z.length; i++){
			// z[i] = new Scanner(System.in).nextInt();
		// }
		
		// System.out.println("Printing Elements of array");

		// for(int i=0; i<z.length; i++){
			// System.out.print(z[i]);
			// System.out.print(" ");
		// }
		
		
		int z[][] = {{1,2,5}, {2,3,1, 43}, {5,8}};
		
		int maxNo = getMaxNo(z[0]);
		
		for(int i = 1; i<z.length; i++) {
			int x = getMaxNo(z[i]);
			if(maxNo < x) {
				maxNo = x;
			}
		}
		
		
		System.out.println("Maximum is");
		System.out.println(maxNo);
		
	}
	
	private static int getMaxNo(int z[]) {
		int maxNo = z[0];
		
		for(int i = 1; i<z.length; i++) {
			if(maxNo < z[i]) {
				maxNo = z[i];
			}
		}
		return maxNo;
	}
}