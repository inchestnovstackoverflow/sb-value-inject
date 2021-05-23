package com.stackoverflow.sbvalueinject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SbValueInjectApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SbValueInjectApplication.class, args);

        String injectedValue = context.getBean(SpringComponent.class).getInjectedValue();
        System.out.println(injectedValue);
    }

}
