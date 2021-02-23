 class Array2{
 
int z=min(new int[]{2,3,1,5,4});

	private static int getMin(int z[]){
		Array2 obj=new Array2(z);
		
		int min=z[0];
		for(int i=1;i<=obj.z.lenght;i++){
			if(min>z[i]){
			min=z[i];
			}
		}
		return min;
	}
	
	public static void main(String args[]){
		int min=getMin(z[0]);
		for(i=1;i<=obj.z.length;i++){
		int x=getMin(z[i]);
		if(getMin>x){
		getMin=x;
		}
		}
	System.out.println("the minimum value is."+getMin);
	}
	
}