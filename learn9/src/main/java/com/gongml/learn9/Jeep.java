package com.gongml.learn9;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component("jeep")
public class Jeep implements Runnable {
    @Async
    @Override
    public void run() {
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println("====="+i+"=====");
                TimeUnit.SECONDS.sleep(1);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
