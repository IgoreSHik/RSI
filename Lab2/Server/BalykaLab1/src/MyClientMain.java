import java.rmi.Naming;
import java.util.Scanner;
public class MyClientMain {
public static void main(String[] args) {
System.setProperty("java.security.policy", "file:/C:/Users/student/Documents/Eclipse/BalykaLab1/security.policy");
System.setSecurityManager(new SecurityManager());
try {
MyServerInt myRemoteObject = (MyServerInt) Naming.lookup("//26.97.55.27/ABC");
String text = "Hallo :-)";
String result = myRemoteObject.getDescription(text);

Scanner myInput = new Scanner( System.in );
System.out.print( "Podaj pierwsz� liczb�: " );
int a = myInput.nextInt();
System.out.print( "Podaj drug� liczb�: " );
int b = myInput.nextInt();
System.out.print( "Podaj znak: " ); 
char c = myInput.next().charAt(0);
System.out.println("A="+a);
System.out.println("B="+b);
System.out.println(a+" "+c+" "+b+" = "+myRemoteObject.getResult(a,b,c));

System.out.println("Wys�ano do servera: " + text);
System.out.println("Otrzymana z serwera odpowied�: " + result);
} catch (Exception e) {
e.printStackTrace();
}}}
