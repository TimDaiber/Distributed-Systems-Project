package ie.gmit.sw;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class mypool {
	// An Executor that provides methods to manage termination and methods that can produce a Future for tracking progress of one or more asynchronous tasks.
	// Creates a thread pool that creates new threads as needed, but will reuse previously constructed threads when they are available.
	private ExecutorService executor = Executors.newCachedThreadPool();

	
	public void compareStrings(callqueue queue, Result result) {

		for (int i = 0; i < queue.getSize(); i++) {
			//Submits a value-returning task for execution and returns a Future representing the pending results of the task.
			executor.submit(new Resultables(queue, result));
		}
		// shuts down executor
		executor.shutdown();


		try {
			//Blocks until all tasks have completed execution after a shutdown request,
			// or the timeout occurs, or the current thread is interrupted, whichever happens first.
			executor.awaitTermination(10, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

	}
}
