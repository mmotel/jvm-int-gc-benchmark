package one.thread.one.size.per.n;
import memory.eater.MemoryEater;

public class Main {
	
public static void main(String[] args) throws InterruptedException{
		
		long StartTime;
		long StopTime;
		long Duration;
		
		final long N = 100000; 
		
		StartTime = System.currentTimeMillis();
		for(int i = 0; i < N; i++){
			MemoryEater.alloc(1);
		}

		
		StopTime = System.currentTimeMillis();
		Duration = (StopTime - StartTime);
		
		System.out.println("Time: " + Duration + "ms");
	}

}
