package com.yicj.study.service.impl;

import com.yicj.study.service.HelloService;

public class HelloServiceImpl implements HelloService {

    @Override
    public void hello() {
        System.out.println("hello world" );
    }
}
