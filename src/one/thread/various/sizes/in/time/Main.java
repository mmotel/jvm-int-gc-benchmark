package one.thread.various.sizes.in.time;


public class Main {

	public static void main(String[] args) throws InterruptedException{
		
		Thread t = new MyThread();
		
		t.start();
		
		for(int i = 0; i < 10; i++){
			Thread.sleep(1000);
			((MyThread) t).incSize();
		}
		
		System.out.println("Count: " + ((MyThread) t).getCounter() );
	}
	
}
