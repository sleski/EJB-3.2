package it.tostao.kickstarter.ejb3.impl;

import it.tostao.kickstarter.ejb3.api.HelloWorld;

import javax.ejb.Stateless;

@Stateless
public class HelloWorldBean implements HelloWorld {

    public String sayHello() {
        return "Hello EJB3 World !!!";
    }

}
