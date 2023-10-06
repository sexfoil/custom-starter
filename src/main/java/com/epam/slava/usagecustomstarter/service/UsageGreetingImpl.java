package com.epam.slava.usagecustomstarter.service;

import com.epam.jgmp.customstarter.service.SlavaGreeting;

public class UsageGreetingImpl implements SlavaGreeting {
    @Override
    public void sayHello() {
        System.out.println("**********************************************");
        System.out.println("* It means there is UsageGreeting Bean here. *");
        System.out.println("**********************************************");
    }
}
