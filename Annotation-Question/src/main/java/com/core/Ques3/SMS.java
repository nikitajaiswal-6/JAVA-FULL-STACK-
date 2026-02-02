package com.core.Ques3;

import org.springframework.stereotype.Component;

@Component
public class SMS implements NotificationService{

    @Override
    public void getMessage() {
        System.out.println("Customer Getting notified through SMS ☺");
    }
}
