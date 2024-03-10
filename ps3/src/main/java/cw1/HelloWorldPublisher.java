package cw1;
import javax.xml.ws.Endpoint;


public class HelloWorldPublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/ws/hello", new HelloWorldImpl());
        System.out.println("Webservice czeka na klienta...");
    }
}
