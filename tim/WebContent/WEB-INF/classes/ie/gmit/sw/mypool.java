package ie.gmit.sw;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class mypool {
	private ExecutorService executor = Executors.newCachedThreadPool();

	public void compareStrings(callqueue queue, Results results) {

		for (int i = 0; i < queue.getSizeOfQueue(); i++) {
			executor.submit(new Resultator(queue, results));
		}
		executor.shutdown();

		System.out.println("All tasks submitted.");

		try {
			executor.awaitTermination(10, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("All tasks completed");
	}
}
