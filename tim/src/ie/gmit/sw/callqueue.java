package ie.gmit.sw;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

//  http://tutorials.jenkov.com/java-util-concurrent/blockingqueue.html
public class callqueue {
	// creates new linked blocking queue of type callable
	private BlockingQueue<Callable> queue = new LinkedBlockingQueue<Callable>();

	// adds call to queue
	public void addcalltoqueue(Callable call) {
		try {
			// puts call in queue
			queue.put(call);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
	// gets size of queue
	public int getSize() {
		return this.queue.size();
	}
	// Retrieves and removes the head of this queue, or returns null if this queue is empty.
	public Callable getRec() {
		return this.queue.poll();
	}
	// checks if queue is empty
	public boolean isQueueEmpty() {
		return this.queue.isEmpty();
	}
	// retrieves the queue of type callable
	public BlockingQueue<Callable> getQueue() {
		// TODO Auto-generated method stub
		return this.queue;
	}
}
