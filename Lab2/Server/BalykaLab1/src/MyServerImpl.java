import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class MyServerImpl extends UnicastRemoteObject implements MyServerInt {
	protected MyServerImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	int i = 0;
	public String[] listBook = new String[] {"solaris", "sci-fi", "cthulchu", "lovecraft", "song of ice and flame", "martin knights deaths dragons"};
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
		// TODO Auto-generated method stub
		String out = "";
		for (int i = 0; i < listBook.length/2; i++)
			out += "Tytul:" + listBook[i*2] + " Opis:" + listBook[i*2+1] + "\n";
		System.out.println("Wyslana lista:"+out);
		return out;
	}
	
	@Override
	public String findRecord(String name) throws RemoteException {
		// TODO Auto-generated method stub
		for (int i = 0; i < listBook.length/2; i++)
			if (listBook[i*2].equals(name)) return listBook[i*2+1];
		return "NIEMA TAKIEGO REKORDU";
	}
	
	@Override
	public Book book(String line) throws RemoteException {
		// TODO Auto-generated method stub
		for (int i = 0; i < listBook.length/2; i++)
			if (listBook[i*2].equals(line)) return new Book(listBook[i*2], listBook[i*2+1]);
		return new Book(line, "NIEMA TAKIEGO REKORDU");
	}
	
	List<String> chat = new ArrayList<String>();
	
	@Override
	public String getMessage(int line) throws RemoteException {
		// TODO Auto-generated method stub
		if (line < chat.size()) return (String)((chat.toArray())[line]);
		return null;
	}
	
	@Override
	public void sendMessage(String line) throws RemoteException {
		// TODO Auto-generated method stub
		chat.add(line);
		System.out.println(line);
	}
}