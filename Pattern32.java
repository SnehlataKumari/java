class Pattern32{
	public static void main(String args[]){
	
		for(int i=1;i<=5;i++){
			int n=1;
			for(int j=1;j<=i;j++){
				if(i%2==0){
				System.out.print(n);
				n++;
				}
				else{
					System.out.print("*");
				}
			}
			
			System.out.println();
			
		}
		
	}
}