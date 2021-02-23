class Thread2 extends Thread{
	Thread2(String s){
		super(s);
		//start();
	}
	public void run(){
		for(int i=1;i<=20;i++){
				System.out.println(Thread.currentThread().getName());
		//System.out.println(getName());
		}	
	System.out.println(getName()+"dead");
	}
	
}