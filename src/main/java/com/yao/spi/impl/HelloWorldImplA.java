package com.yao.spi.impl;

import com.yao.spi.HelloWorld;

/**
 * Created by yao on 15/7/12.
 */
public class HelloWorldImplA implements HelloWorld {

    @Override
    public void sayHello() {
        System.out.println("say hello A-------");
    }
}
