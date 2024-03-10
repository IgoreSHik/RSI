package cw1;

import javax.jws.WebService;

@WebService(endpointInterface = "cw1.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
    
@Override
public String getHelloWorldAsString(String name) {
return "Witaj świecie JAX-WS: " + name;
}
}