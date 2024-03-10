
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface MyServerInt extends Remote{
String getDescription(String text) throws RemoteException;
int Calculate(int a, int b, String operation) throws RemoteException;
}