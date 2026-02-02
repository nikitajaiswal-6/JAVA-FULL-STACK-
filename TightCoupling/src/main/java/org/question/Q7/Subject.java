package org.question.Q7;

import java.util.Map;



public class Subject {

    Map<String, String> listMap;

    public void setListMap(Map<String, String> listMap) {
        this.listMap = listMap;
    }

   public void show()
    {
        listMap.forEach((key,val)-> System.out.println(key+" ="+ val));
    }
}
