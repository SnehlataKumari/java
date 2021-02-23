class Thread3 extends Thread{
	Thread3(String s){
		super(s);
		//start();
	}
	public void run(){
		for(int i=1;i<=30;i++){
				System.out.println(Thread.currentThread().getName());
		//System.out.println(getName());
		}	
	System.out.println(getName()+"dead");
	}

}