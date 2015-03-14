package four.threads.one.size.in.time;


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
		
		Thread.sleep(10000);
		
		long count1 = ((MyThread) t1).getCounter();
		long count2 = ((MyThread) t2).getCounter();
		long count3 = ((MyThread) t3).getCounter();
		long count4 = ((MyThread) t4).getCounter();
		
		System.out.println("Count1: " + count1);
		System.out.println("Count2: " + count2);
		System.out.println("Count3: " + count3);
		System.out.println("Count4: " + count4);
	}
	
}
