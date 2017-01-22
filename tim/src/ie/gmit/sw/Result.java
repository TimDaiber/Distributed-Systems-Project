package ie.gmit.sw;

import java.util.HashMap;
import java.util.Map;

public class Result {
	// creates new HashMap with Strings as keys and Callable objects as value
	private Map<String, Callable> results = new HashMap<String, Callable>();
	
	// adds a result to the hashmap
	public void addResult(String key, Callable value){
		results.put(key, value);
	}
	// returns key value of result from the hashmap
	public Callable takeResult(String key){
		return results.get(key);
	}
	// checks if hasmap is empty
	public boolean isResultsEmpty(){
		return this.results.isEmpty();
	}
	// returns result
	public Map<String, Callable> getResults(){
		return this.results;
	}
	// checks if result contains a key
	public boolean isResultReady(String key){
		return this.results.containsKey(key);
	}
}
