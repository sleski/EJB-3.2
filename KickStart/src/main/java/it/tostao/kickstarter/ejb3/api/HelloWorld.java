package it.tostao.kickstarter.ejb3.api;

import javax.ejb.Remove;

public interface HelloWorld {

    @Remove
    public String sayHello();
}
