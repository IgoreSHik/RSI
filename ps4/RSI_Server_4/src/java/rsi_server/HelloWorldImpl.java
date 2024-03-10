/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsi_server;

/**
 *
 * @author dell
 */
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
@WebService(endpointInterface = "rsi_server.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
    private List<Product> products = new ArrayList<>();
    
    public HelloWorldImpl() {
        products.add(new Product("jajka", "abcd", 10));
        products.add(new Product("mleko", "białe", 15));
    }

    @Override
    public String getHelloWorldAsString(String name) {
        return "Witaj świecie JAX-WS: " + name;
    }
    
        @Override
    public List<Product> getProducts(){
        return products;
    }
}
