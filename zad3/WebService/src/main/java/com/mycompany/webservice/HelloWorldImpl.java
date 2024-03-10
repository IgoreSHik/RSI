/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.webservice;

import javax.jws.WebService;

@WebService(endpointInterface = "com.mycompany.webservice.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
    
@Override
public String getHelloWorldAsString(String name) {
return "Witaj świecie JAX-WS: " + name;
}
}