package com.bilalalp.camel.sample2.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;


public class FileProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {

        final String body = exchange.getIn().getBody(String.class);

        final String transformedBody = body.toUpperCase();
        exchange.getIn().setBody(transformedBody);
    }
}
