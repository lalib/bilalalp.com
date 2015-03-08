package com.bilalalp.camel.sample3;

import com.bilalalp.camel.sample3.route.TimerRouteBuilder;
import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class Program {

    public static void main(String[] args) throws Exception {

        new Program().run();
    }

    private static void run() throws Exception {

        final CamelContext camelContext = new DefaultCamelContext();
        camelContext.addRoutes(new TimerRouteBuilder());
        camelContext.start();

        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                try {
                    camelContext.stop();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });

        waitForStop();
    }

    private static void waitForStop() {
        while (true) {
            try {
                Thread.sleep(Long.MAX_VALUE);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}