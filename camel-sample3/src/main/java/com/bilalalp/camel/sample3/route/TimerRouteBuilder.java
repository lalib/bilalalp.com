package com.bilalalp.camel.sample3.route;

import com.bilalalp.camel.sample3.processor.TimerProcessor;
import org.apache.camel.builder.RouteBuilder;

public class TimerRouteBuilder extends RouteBuilder {
    @Override
    public void configure() throws Exception {

        from("timer://timer1?period=60000").bean(TimerProcessor.class, "sendEmail");
    }
}
