package one.thread.various.sizes.per.n;
import memory.eater.MemoryEater;

public class Main {
	
public static void main(String[] args) throws InterruptedException{
		
		long StartTime;
		long StopTime;
		long Duration;
		
		final long N = 10000; 
		int size = 0;
		
		StartTime = System.currentTimeMillis();
		for(int i = 0; i < N; i++){
			if(i%1000 == 0){
				size +=1;
			}
			MemoryEater.alloc(size);
		}

		
		StopTime = System.currentTimeMillis();
		Duration = (StopTime - StartTime);
		
		System.out.println("Time: " + Duration + "ms");
	}

}
