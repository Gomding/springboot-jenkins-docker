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

        System.out.println("새로운 버전 SNAPSHOT-1.0.1 도 배포했다고");

        System.out.println("아니 push만 해도 배포가 된다고?");

        System.out.println("다시하자");

        System.out.println("이번엔 되겠지");

        System.out.println("ddd");
    }
}
