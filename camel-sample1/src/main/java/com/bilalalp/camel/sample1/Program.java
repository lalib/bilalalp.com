package com.bilalalp.camel.sample1;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class Program {

    public static void main(String[] args) throws Exception {

        final CamelContext camelContext = new DefaultCamelContext();
        camelContext.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("file:C:\\db\\input?noop=false&delete=true").to("file:C:\\db\\output");
            }
        });
        camelContext.start();
        Thread.sleep(10000);
        camelContext.stop();
    }
}