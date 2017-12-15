package LabTasks;

public class UndergraduateStudent extends Student {

    public UndergraduateStudent(String name){
        super(name);
    }

    @Override
    public void computeGrade() {
        if(getTestScore()>=70)
            setGrade("pass");
        else
            setGrade("fail");
    }
}