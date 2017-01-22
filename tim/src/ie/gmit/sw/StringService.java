package ie.gmit.sw;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface StringService extends Remote, Serializable
{

	public String getMessage() throws RemoteException;
	
}