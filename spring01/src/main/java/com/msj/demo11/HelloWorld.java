package com.msj.demo11;

import javax.annotation.Resource;

public class HelloWorld {
    private Hello hello;
    private String name;

    public Hello getHello() {
        return hello;
    }

    @Resource(name="hello")
    public void setHello(Hello hello) {
        this.hello = hello;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void test(){
        hello.testHello();
    }
}
