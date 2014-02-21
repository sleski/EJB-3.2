package it.tostao.kickstarter.ejb3.impl;

import it.tostao.kickstarter.ejb3.api.HelloWorld;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class HelloWorldBean implements HelloWorld {

    @Override
    public String sayHello() {
        return "Hello EJB3 World !!!";
    }

}
