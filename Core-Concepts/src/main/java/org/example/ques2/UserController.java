package org.example.ques2;

import org.springframework.beans.factory.annotation.Autowired;

public class UserController {

    UserService userService;

    public UserController() {
    }

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public UserService getUserService() {
        return userService;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
        System.out.println("Services injected by the setter");
    }


    public void Controller(){
        userService.Haircare();
        userService.Skincare();
        userService.food();
        System.out.println("☺---SERVICES TAKEN BY THE USER---☺ ");
    }
}
