package ie.gmit.sw;

import java.util.HashMap;
import java.util.Map;

public class Result {
	private Map<String, Callable> results = new HashMap<String, Callable>();
	
	public void addResult(String key, Callable value){
		results.put(key, value);
	}
	
	public Callable takeResult(String key){
		return results.get(key);
	}
	
	public boolean isResultsEmpty(){
		return this.results.isEmpty();
	}
	
	public Map<String, Callable> getResults(){
		return this.results;
	}
	
	public boolean isResultReady(String key){
		return this.results.containsKey(key);
	}
}
