import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.*;

public interface MyServerInt extends Remote {
    String getDescription(String text) throws RemoteException;

    int Calculate(int a, int b, String operation) throws RemoteException;

    List < Person > getPersons() throws RemoteException;

    Person getPerson(String lastName) throws RemoteException;
}