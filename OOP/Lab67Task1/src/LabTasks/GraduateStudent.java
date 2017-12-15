package LabTasks;

public class GraduateStudent extends Student {
    /**
     * Constructor for creating a GraduateStudent object
     * @param name
     */
    public GraduateStudent(String name){
        super(name);
    }
    /**
     * Computes grade by setting grade as pass if score is >=60, else setting grade as fail
     * Preconditions:test score is always positive and less than equal to 100
     */
    @Override
    public void computeGrade() {
        if(getTestScore()>=60)
            setGrade("pass");
        else
            setGrade("fail");
    }
}