package com.core.Ques2;


//2.
//Create UserService and UserRepository.
//Service should call repository method saveUser().

import org.springframework.stereotype.Component;

@Component("user")
public class UserRepository {

    int userId=101;
    String userName="Sameer";
    double Salary=80000;


    void saveUSer(){
        System.out.println("User Id:"+userId);
        System.out.println("User Name:"+userName);
        System.out.println("User salary:"+Salary);
    }
}
