package com.bilalalp.camel.sample3.processor;


import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class TimerProcessor implements Processor {

    @Override
    public void process(Exchange exchange) {

        System.out.println("Email sending..");
    }

    public void sendEmail(Exchange exchange) {

        System.out.println("Email sending..");
    }
}
