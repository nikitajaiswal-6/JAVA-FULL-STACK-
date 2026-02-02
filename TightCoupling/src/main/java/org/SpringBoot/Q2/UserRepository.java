package org.SpringBoot.Q2;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    String user="Nikita";
    String pass="love";

    void saveUser()
    {
        System.out.println( user +" data save Successfully ");
    }


}
