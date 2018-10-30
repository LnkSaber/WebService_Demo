package com.saber.Text;

import com.saber.service.impl.HelloServiceImplService;
import com.saber.service.impl.HellowService;

public class Demo {
    public static void main(String[] args) {

        HelloServiceImplService helloServiceImplService = new HelloServiceImplService();

        HellowService proxy = helloServiceImplService.getHelloServiceImplPort();

        String sayHello = proxy.sayHello("saber");
        System.out.println(sayHello);

    }
}
