import java.rmi.Naming;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.setProperty("java.security.policy", "security.policy");
        System.setSecurityManager(new SecurityManager());
        try {
            MyServerInt myRemoteObject = (MyServerInt) Naming.lookup("//rsi-server/ABC");

            List<Person> results = myRemoteObject.getPersons();
            System.out.println("Wysłano do servera rządanie listy osób, liczba zwróconych elementów: " 
            + results.size());

            Person result = myRemoteObject.getPerson("Nowak");
            System.out.println
            ("Wysłano do servera rządanie osoby o nazwisku Nowak, zwrócony element: " 
            + result.toString());


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}