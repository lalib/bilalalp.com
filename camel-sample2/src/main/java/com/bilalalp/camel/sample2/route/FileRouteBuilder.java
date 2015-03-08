package com.bilalalp.camel.sample2.route;


import com.bilalalp.camel.sample2.processor.FileProcessor;
import org.apache.camel.builder.RouteBuilder;

public class FileRouteBuilder extends RouteBuilder {
    @Override
    public void configure() throws Exception {

        from("file:C:\\db\\input?noop=false&delete=true")
                .process(new FileProcessor())
                .to("file:C:\\db\\output");
    }
}
