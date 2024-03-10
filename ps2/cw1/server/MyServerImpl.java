import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.*;
public class MyServerImpl extends UnicastRemoteObject implements MyServerInt {

    int i = 0;
    List < Person > persons = new ArrayList < > ();

    protected MyServerImpl() throws RemoteException {

        super();
        persons.add(new Person("Adam", "Nowak"));
        persons.add(new Person("Jan", "Kowalski"));

    }

    @Override
    public String getDescription(String text) throws RemoteException {
        i++;
        System.out.println("MyServerImpl.getDescription: " + text + " " + i);
        return "getDescription: " + text + " " + i;
    }

    @Override
    public int Calculate(int a, int b, String operation) throws RemoteException {
        switch (operation) {
            case "add":
                return a + b;
            case "substract":
                return a - b;
            case "multiply":
                return a * b;
            default:
                return 0;
        }
    }

    @Override 
    public List < Person > getPersons() {
        return persons;
    }

    @Override 
    public Person getPerson(String lastName) {
        return persons.stream()
            .filter(person -> lastName.equals(person.getLastName()))
            .findAny()
            .orElse(null);
    }
}