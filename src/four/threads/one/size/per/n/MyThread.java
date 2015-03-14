package four.threads.one.size.per.n;
import memory.eater.MemoryEater;

public class MyThread extends Thread {
	
	public void run() {
		
		long StartTime;
		long StopTime;
		long Duration;
		
		StartTime = System.currentTimeMillis();
		final long N = 25000;
		for(int i = 0; i < N; i++){
			MemoryEater.alloc(1);
		}
		
		StopTime = System.currentTimeMillis();
		Duration = (StopTime - StartTime);
		
		System.out.println("Time: " + Duration + "ms");
	}
}
