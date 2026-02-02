package org.collage;


import org.springframework.stereotype.Component;

@Component
public class Students {

    public Students()
    {
        System.out.println("create students object...");
    }


    public  void show()
    {
        System.out.println(" sow method inside students....");
    }
}
