package org.example.newconcepts;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sessionfactory")
public class SessionFactory {

    @Autowired
    DataSource source;

    public SessionFactory(DataSource source) {
        this.source = source;
    }

    void SessionTest(){
        source.SourceTest();
        System.out.println("Session Testing started");
        System.out.println("-------------------------");
    }
}
