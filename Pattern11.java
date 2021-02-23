class Pattern11{
	public static void main(String args[]){
	int r,c,m=1;
	
		for(r=1;r<=5;r++){
		for(c=1;c<=5;c++){
		
		
				if(r%2==0)
				System.out.print(m*2);
			
					else
					
					System.out.print("*");
			}
		
		System.out.println();
if(r%2==0){		
m++;}
		}
		
	}
}