package ie.gmit.sw;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

//  http://tutorials.jenkov.com/java-util-concurrent/blockingqueue.html
public class callqueue {
	private BlockingQueue<Callable> queue = new LinkedBlockingQueue<Callable>();

	public void addcalltoqueue(Callable call) {
		try {
			queue.put(call);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

	public int getSize() {
		return this.queue.size();
	}

	public Callable getRec() {
		return this.queue.poll();
	}

	public boolean isQueueEmpty() {
		return this.queue.isEmpty();
	}

	public BlockingQueue<Callable> getQueue() {
		// TODO Auto-generated method stub
		return this.queue;
	}
}
