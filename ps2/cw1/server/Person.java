import java.io.*;

public class Person implements Serializable{
    private final String FirstName;
    private final String LastName;

    public Person(String firstName, String lastName) {
        FirstName = firstName;
        LastName = lastName;
    }

    public String getLastName() {
        return LastName;
    }
    public String toString() {
        return FirstName + " " + LastName;
    }
}