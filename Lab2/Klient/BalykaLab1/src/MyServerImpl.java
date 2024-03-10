import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class MyServerImpl extends UnicastRemoteObject implements MyServerInt {
	int i = 0;
	protected MyServerImpl() throws RemoteException {
		super();
	}
	@Override
	public String getDescription(String text) throws RemoteException {
		i++;
		System.out.println("MyServerImpl.getDescription: " + text + " " + i);
		return "getDescription: " + text + " " + i;
	}
	@Override
	public double getResult(int a, int b, char c) throws RemoteException {
		if (c == '+') return a+b;
		if (c == '-') return a-b;
		if (c == '/') return a/b;
		if (c == '*') return a*b;
		return 0;
	}
	@Override
	public String getDatabase() throws RemoteException {
		return null;
	}
	@Override
	public String findRecord(String name) throws RemoteException {
		return null;
	}
	@Override
	public Book book(String line) throws RemoteException {
		return null;
	}
}
