package ie.gmit.sw;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
//  http://tutorials.jenkov.com/java-util-concurrent/blockingqueue.html
public class callqueue {
	private BlockingQueue<Callable> queue = new LinkedBlockingQueue<Callable>();
	
	public void addcalltoqueue(Callable call){
		try{
			queue.put(call);
		}catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
	}
	
}
