package com.saber.service.Impl;

import com.saber.service.HellowService;

public class HelloServiceImpl implements HellowService {
    @Override
    public String sayHello(String name) {
        System.out.println("基于CXF开发的服务端，sayHello方法被"+name+"调用了");

        return "欢迎使用本服务！"+name;
    }
}
