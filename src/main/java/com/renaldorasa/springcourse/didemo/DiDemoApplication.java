package com.renaldorasa.springcourse.didemo;

import com.renaldorasa.springcourse.didemo.controllers.ConstructorInjectedController;
import com.renaldorasa.springcourse.didemo.controllers.GetterInjectedController;
import com.renaldorasa.springcourse.didemo.controllers.MyController;
import com.renaldorasa.springcourse.didemo.controllers.PropertyInjectedController;
import com.renaldorasa.springcourse.didemo.examplebeans.FakeDataSource;
import com.renaldorasa.springcourse.didemo.examplebeans.FakeJmsBroker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");
        
        FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUser());
        
        FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);
        System.out.println(fakeJmsBroker.getUsername());
    }
}
