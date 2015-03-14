package four.threads.one.size.in.time;
import memory.eater.MemoryEater;

public class MyThread extends Thread {
	
	private long counter = 0;
	private volatile boolean condition = true;
	
	public void run() {

		while(condition){
			MemoryEater.alloc(1);
			counter++;
		}
	}
	
	public long getCounter() {
		this.condition = false;
		return counter;
	}
}
