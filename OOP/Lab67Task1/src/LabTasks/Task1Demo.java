package LabTasks;

public class Task1Demo {
    public static void main(String[] args) {
        Student[] studentArray = new Student[5];
        studentArray[0]=new UndergraduateStudent("Sara");
        studentArray[1]=new UndergraduateStudent("Ahmed");
        studentArray[2]=new GraduateStudent("Farwah");
        studentArray[3]=new UndergraduateStudent("Azra");
        studentArray[4]=new GraduateStudent("Saad");
        studentArray[0].setTestScore(61);
        studentArray[1].setTestScore(72);
        studentArray[2].setTestScore(65);
        studentArray[3].setTestScore(40);
        studentArray[4].setTestScore(85);
        for(int i=0;i<studentArray.length;i++){
            studentArray[i].computeGrade();
            System.out.println("Name: "+studentArray[i].getName()+", Score: "+studentArray[i].getTestScore()+", Grade: "+studentArray[i].getGrade());
        }


    }



}
