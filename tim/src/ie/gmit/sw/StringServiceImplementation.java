package ie.gmit.sw;

import java.rmi.RemoteException;

public class StringServiceImplementation implements StringService {

	
	private static final long serialVersionUID = 1L;
	
	public StringServiceImplementation() throws RemoteException{}
	
	
	
	public String getMessage() {
		
		return "Test";
	}

}
