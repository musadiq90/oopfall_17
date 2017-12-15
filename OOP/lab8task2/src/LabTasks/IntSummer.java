package LabTasks;

import java.util.List;

public class IntSummer implements Summer<Integer> {

    @Override
    public Integer sum(List<Integer> lst) {
        Integer sum=0;
        for(Integer i : lst)
            sum+=i;
        return sum;
    }
}