class Thread1 extends Thread{
	Thread1(String s){
		super(s);
		//start();
	}
	public void run(){
		for(int i=1;i<=5;i++){
				System.out.println(Thread.currentThread().getName());
		
		}	
	System.out.println(getName()+"dead");
	}
	
	
}