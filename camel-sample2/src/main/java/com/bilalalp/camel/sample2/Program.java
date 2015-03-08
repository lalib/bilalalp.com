package com.bilalalp.camel.sample2;

import com.bilalalp.camel.sample2.route.FileRouteBuilder;
import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

public class Program {

    public static void main(String[] args) throws Exception {
        final CamelContext camelContext = new DefaultCamelContext();
        camelContext.addRoutes(new FileRouteBuilder());
        camelContext.start();
        Thread.sleep(10000);
        camelContext.stop();
    }
}
