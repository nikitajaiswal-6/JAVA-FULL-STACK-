package org.SpringBoot.Q3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Sms implements NotificationService{

    @Autowired
    NotificationService notificationService;

    public Sms() {
    }
    @Override
    public void sentMessage() {
        System.out.println("Msg sent sms Through...");
    }
}
