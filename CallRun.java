class CallRun{
public static void main(String s[]){
	Thread1 t1=new Thread1("Thread1");
	Thread2 t2=new Thread2("Thread2");
	Thread3 t3=new Thread3("Thread3");
	//Thread3 t3=Thread3("Thread4");
	t1.run();
	t2.run();
	t3.run();
		//t4.start();
	
}
}