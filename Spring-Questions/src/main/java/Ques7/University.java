package Ques7;

import java.util.HashMap;
import java.util.Map;

public class University {

    private Map<String,String> subTech;

    public void setSubTech(Map<String, String> subTech) {
        this.subTech = subTech;
    }

    void show() {
        for (Map.Entry<String, String> entry : subTech.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
