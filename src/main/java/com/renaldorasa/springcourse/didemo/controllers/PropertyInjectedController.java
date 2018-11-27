package com.renaldorasa.springcourse.didemo.Controllers;

import com.renaldorasa.springcourse.didemo.services.GreetingServiceImpl;

public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }
}
