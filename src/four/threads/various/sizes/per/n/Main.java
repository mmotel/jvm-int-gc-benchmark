package four.threads.various.sizes.per.n;


public class Main {

	public static void main(String[] args) throws InterruptedException{
		
		Thread t1 = new MyThread();		
		Thread t2 = new MyThread();
		Thread t3 = new MyThread();
		Thread t4 = new MyThread();

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
	
}
