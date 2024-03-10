/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package webservices;

import com.mycompany.webservice.HelloWorld;
import com.mycompany.webservice.HelloWorldImplService;
import javax.xml.ws.Service;
/**
 *
 * @author UMB
 */
public class WebServiceClient {
    public static void main (String[] args){
        HelloWorldImplService helloService = new HelloWorldImplService();
        HelloWorld hello = helloService.getHelloWorldImplPort();
        String zapytanie = "To ja - klient";
        String response = hello.getHelloWorldAsString(zapytanie);
        System.out.println("Klient wyslal: " + zapytanie);
        System.out.println("Klient otrzymal: " + response);
        
    }
    
}
