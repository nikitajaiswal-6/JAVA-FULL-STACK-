package org.SpringBoot.Q11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Services {

    Repository repository;

    @Autowired
    public Services(Repository repository) {
        this.repository = repository;
    }

    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    void service()
    {
        repository.rep();
        System.out.println("service service......");
    }
}
