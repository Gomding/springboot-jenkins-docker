package com.learn.jenkins;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class JenkinsRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("do something");
        System.out.println("한번 일할거임");
        System.out.println("두번 일할거임");
        System.out.println("세번 일할거임");
    }
}
