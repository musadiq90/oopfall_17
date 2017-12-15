package LabTasks;

import java.util.List;


public class StringSummer implements Summer<String> {
    @Override

    public String sum( List <String> lst) {

        String sum = "";

        for(String i : lst)

            sum = sum+i;

        return sum;

    }
}
