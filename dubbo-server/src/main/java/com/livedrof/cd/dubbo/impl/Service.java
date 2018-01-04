package com.livedrof.cd.dubbo.impl;

import com.livedrof.cd.dubbo.IService;

public class Service implements IService {
    public String sayHello(String args) {
        return "hello dubbo";
    }
}
