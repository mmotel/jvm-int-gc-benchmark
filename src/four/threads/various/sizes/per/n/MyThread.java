package four.threads.various.sizes.per.n;
import memory.eater.MemoryEater;

public class MyThread extends Thread {
	
	public void run() {
		
		long StartTime;
		long StopTime;
		long Duration;
		int size = 0;
		
		StartTime = System.currentTimeMillis();
		final long N = 2500;
		for(int i = 0; i < N; i++){
			if(i%250 == 0){
				size += 1;
			}
			MemoryEater.alloc(size);
		}
		
		StopTime = System.currentTimeMillis();
		Duration = (StopTime - StartTime);
		
		System.out.println("Time: " + Duration + "ms");
	}
}
