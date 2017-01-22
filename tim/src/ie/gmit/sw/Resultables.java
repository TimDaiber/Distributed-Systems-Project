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
		request = queue.getRec();
		
		try{
			
			Servantable service = (Servantable)Naming.lookup("rmi://localhost:1099/compare");
			int r = service.getResult(request.getEntry1(), request.getEntry2(), request.getAlgorithm());
			
			request.setResult(r);
			
			if(request.getResult() != null){
				results.addResult(request.getJobNumber(), request);
			}

		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}

	}
}
