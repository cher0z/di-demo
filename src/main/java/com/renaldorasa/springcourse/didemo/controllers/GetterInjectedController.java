package com.renaldorasa.springcourse.didemo.Controllers;

import com.renaldorasa.springcourse.didemo.services.GreetingService;
import com.renaldorasa.springcourse.didemo.services.GreetingServiceImpl;

public class GetterInjectedController {

    private GreetingService greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }

    public void ConstructorInjectedController(GreetingService greetingService){
        this.greetingService = greetingService;
    }
}
