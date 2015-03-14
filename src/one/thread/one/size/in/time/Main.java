package one.thread.one.size.in.time;


public class Main {

	public static void main(String[] args) throws InterruptedException{
		
		Thread t = new MyThread();
		
		t.start();
		
		Thread.sleep(10000);
		
		System.out.println("Count: " + ((MyThread) t).getCounter() );
	}
	
}
