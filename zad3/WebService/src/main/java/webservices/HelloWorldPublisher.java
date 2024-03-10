/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package webservices;

import javax.xml.ws.Endpoint;
import com.mycompany.webservice.HelloWorldImpl;

/**
 *
 * @author UMB
 */
public class HelloWorldPublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/ws/hello", new HelloWorldImpl());
        System.out.println("Webservice czeka na klienta...");
    }
    
}
