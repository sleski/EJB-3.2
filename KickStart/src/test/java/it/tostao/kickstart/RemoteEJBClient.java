package it.tostao.kickstart;

import it.tostao.kickstarter.ejb3.api.HelloWorld;
import it.tostao.kickstarter.ejb3.api.HelloWorld2Remote;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class RemoteEJBClient {

    public static void main(String[] args) throws Exception {
        testRemoteEJB();

    }

    private static void testRemoteEJB() throws NamingException {

        final HelloWorld ejb = lookupRemoteEJB();
        String s = ejb.sayHello();
        System.out.println(s);
    }

    private static HelloWorld lookupRemoteEJB() throws NamingException {
        final Hashtable jndiProperties = new Hashtable();
        jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");

        final Context context = new InitialContext(jndiProperties);

        final String appName = "";
        final String moduleName = "as7project";
        final String distinctName = "";
        final String beanName = HelloWorld2Remote.class.getSimpleName();

        final String viewClassName = SampleBeanRemote.class.getName();
        System.out.println("Looking EJB via JNDI ");
        System.out.println("ejb:" + appName + "/" + moduleName + "/" + distinctName + "/" + beanName + "!"
                + viewClassName);

        return (SampleBeanRemote) context.lookup("ejb:" + appName + "/" + moduleName + "/" + distinctName + "/"
                + beanName + "!" + viewClassName);

    }

}