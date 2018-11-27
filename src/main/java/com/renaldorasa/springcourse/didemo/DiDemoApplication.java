package com.renaldorasa.springcourse.didemo;

import com.renaldorasa.springcourse.didemo.controllers.ConstructorInjectedController;
import com.renaldorasa.springcourse.didemo.controllers.GetterInjectedController;
import com.renaldorasa.springcourse.didemo.controllers.MyController;
import com.renaldorasa.springcourse.didemo.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");
        controller.hello();

        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }
}
