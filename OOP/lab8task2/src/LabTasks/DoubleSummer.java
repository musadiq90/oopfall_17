package LabTasks;

import java.util.List;

public class DoubleSummer implements Summer<Double> {

    @Override
    public Double sum(List<Double> lst) {
        Double sum=0.0;
        for(Double i : lst)
            sum+=i;
        return sum;
    }
}