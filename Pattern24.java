class Pattern24{
	public static void main(String args[]){
	char c=65;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(c);
				c++;
			}
			c=65;
			System.out.println();
		}
		
	}
}