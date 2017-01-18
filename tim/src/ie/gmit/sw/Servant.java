package ie.gmit.sw;


import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Servant {

	/**
	 * @param args
	 */
	private static final long serialVersionUID = 1L;
	public Servant() throws RemoteException {}
	/*public int getResult(String s, String t, String alg) throws RemoteException {
		ComparatorRemote cr = new Compare();
		return cr.doCompare(s, t, alg);
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*try {

			StringService strS = new StringServiceImplementation();

			LocateRegistry.createRegistry(1099);

			Naming.rebind("compareStrings", strS);

		} catch (Exception ex) {

			ex.printStackTrace();

		}*/

		/*
		 * To work with remote server we need to set property of
		 * java.rmi.server.hostname as a server ip address
		 * solution was found in http://stackoverflow.com/questions/15685686/java-rmi-connectexception-connection-refused-to-host-127-0-1-1
		 * 
		 * System.setProperty("java.rmi.server.hostname","192.168.0.19");
		 * 
		 */
		try{
			Servantable service = (Servantable) new Servant();
		//Start the RMI regstry on port 1099
		LocateRegistry.createRegistry(1099);
		Naming.rebind("compare", service);
		System.out.println("Server ready.");
	}catch(Exception ex){
		System.out.println(ex.getMessage());
	}
		System.out.println("Running test test if you read this its working!");

	}
}
