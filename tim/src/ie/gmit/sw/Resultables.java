package ie.gmit.sw;

import java.rmi.Naming;

public class Resultables implements Runnable {

	private callqueue queue;
	private Result results;
	private Callable request;
	
	public Resultables(callqueue queue, Result results){
		this.queue = queue;
		this.results = results;
	}

	@Override
	public void run() {
		// sets request = to the head of the queue takes head of the queue
		request = queue.getRec();
		
		try{
			
			Servantable service = (Servantable)Naming.lookup("rmi://localhost:1099/compare");
			// declares new int variable = to results of method calls
			int r = service.getResult(request.getEntry1(), request.getEntry2(), request.getAlgorithm());
			// sets result
			request.setResult(r);
			// if result does not = null
			if(request.getResult() != null){
				// add result
				results.addResult(request.getJobNumber(), request);
			}

		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}

	}
}
