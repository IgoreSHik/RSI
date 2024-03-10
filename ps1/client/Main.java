import java.rmi.Naming;
public class Main {
    public static void main(String[] args) {
        System.setProperty("java.security.policy", "security.policy");
        System.setSecurityManager(new SecurityManager());
        try {
            MyServerInt myRemoteObject = (MyServerInt) Naming.lookup("//rsi-server/ABC");

            int result = myRemoteObject.Calculate(10, 24, "add");
            System.out.println("Wysłano do servera: " + 10 + " add " + 24);
            System.out.println("Otrzymana z serwera odpowiedź: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}