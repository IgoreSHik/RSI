import java.io.Serializable;

public class Book implements Serializable {
	String name;
	String description;
	Book(String name, String description)
	{
		this.name = name;
		this.description = description;
	}
}
