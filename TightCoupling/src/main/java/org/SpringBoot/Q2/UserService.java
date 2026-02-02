package org.SpringBoot.Q2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    UserRepository userRepository;

    public UserService() {
    }

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
        System.out.println("injection setter.....");
    }

    public void UserServiceCalled()
    {
        userRepository.saveUser();
    }
}
