/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package webservices;

import com.mycompany.webservice.HelloWorld;
import com.mycompany.webservice.HelloWorldImplService;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;

/**
 *
 * @author UMB
 */
public class WebSerivceClient2 {

    public static void main(String[] args) throws MalformedURLException {

        URL url = new URL("http://localhost:9999/ws/hello?wsdl");
        QName qname = new QName("http://webservice.mycompany.com/", "HelloWorldImplService");

        Service service = Service.create(url, qname);
        HelloWorld hello = service.getPort(HelloWorld.class);
        String zapytanie = "To ja - klient";
        
        BindingProvider bp = (BindingProvider) hello;
        String address = (String) bp.getRequestContext().get(BindingProvider.ENDPOINT_ADDRESS_PROPERTY);
        address = address.replaceFirst("9999", "8080");
        bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address);
 
        String response = hello.getHelloWorldAsString(zapytanie);
        System.out.println("Klient wyslal: " + zapytanie);
        System.out.println("Klient otrzymal: " + response);

    }
}
