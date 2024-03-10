import java.rmi.Remote;
import java.rmi.RemoteException;
public interface MyServerInt extends Remote{
	String getDescription(String text) throws RemoteException;
	double getResult(int a, int b, char c) throws RemoteException;
	String getDatabase() throws RemoteException;
	String findRecord(String name) throws RemoteException;
	Book book(String line) throws RemoteException;
	String getMessage(int line) throws RemoteException;
	void sendMessage(String line) throws RemoteException;
}