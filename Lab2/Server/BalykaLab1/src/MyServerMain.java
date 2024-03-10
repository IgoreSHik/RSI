import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.Scanner;
public class MyServerMain {
	
public static void main(String[] args) {
	try {
		System.setProperty("java.security.policy", "file:/C:/Users/student/Documents/Eclipse/BalykaLab1/security.policy");
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager());
		}
		//System.setProperty("java.rmi.server.codebase","file:/C:/Users/student/Documents/Eclipse/BalykaLab1/bin/");
		System.setProperty("java.rmi.server.codebase","file:/C:/Users/student/Documents/Eclipse/BalykaLab1/build/classes/");
		//System.setProperty("java.rmi.server.codebase", "http://192.168.1.102/jaco/");
		System.out.println("Codebase: " + System.getProperty("java.rmi.server.codebase"));
		System.setProperty("java.rmi.server.hostname", "26.97.55.27");

		LocateRegistry.createRegistry(1099);
		MyServerImpl obj1 = new MyServerImpl();
		Naming.rebind("//26.97.55.27/ABC", obj1);
		System.out.println("Serwer oczekuje ...");
		
		Scanner myInput = new Scanner (System.in);
		String line = "";
		while (!line.equals("EXIT"))
		{
			obj1.chat.add(line);
			line = myInput.next();
		}
		
		} catch (RemoteException | MalformedURLException e) {
		e.printStackTrace();
		}
	}
}