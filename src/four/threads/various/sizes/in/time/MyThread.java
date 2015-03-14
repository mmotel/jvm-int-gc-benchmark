package four.threads.various.sizes.in.time;
import memory.eater.MemoryEater;

public class MyThread extends Thread {
	
	private long counter = 0;
	private volatile boolean condition = true;
	private volatile int size = 1;
	
	public void run() {
		while(condition){
			MemoryEater.alloc(size);
			counter++;
		}
	}
	
	public long getCounter() {
		this.condition = false;
		return counter;
	}
	
	public void incSize(){
		this.size += 1;
	}
}
