package ie.gmit.sw;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class mypool {
	private ExecutorService executor = Executors.newCachedThreadPool();

	public void compareStrings(callqueue queue, Result result) {

		for (int i = 0; i < queue.getSize(); i++) {
			executor.submit(new Resultables(queue, result));
		}
		executor.shutdown();


		try {
			executor.awaitTermination(10, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

	}
}
