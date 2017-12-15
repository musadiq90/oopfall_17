package LabTasks;

public class Student {
    private String name;
    private int testScore;
    private String grade;

    /**
     * Constructor for creating a Student object
     * @param name
     */
    public Student(String name){
        this.name=name;
    }

    /**
     * Getter for name of Student object
     * @return name
     */
    public String getName(){
        return name;
    }
    /**
     * Getter for test score of Student object
     * @return test score
     */
    public int getTestScore(){
        return testScore;
    }
    /**
     * Setter for test score of Student object
     * Precondition: test score is always positive and less than or equal to 100
     */
    public void setTestScore(int score){
        testScore=score;
    }
    /**
     * Getter for grade of Student object
     * @return grade
     */
    public String getGrade(){
        return grade;
    }
    /**
     * Setter for grade of Student object
     * @return grade
     */
    public void setGrade(String grade){
        this.grade=grade;
    }
    /**
     * To be overrided and implemented by subclasses
     */
    public void computeGrade(){

    }
}