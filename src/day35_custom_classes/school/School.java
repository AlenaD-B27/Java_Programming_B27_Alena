package day35_custom_classes.school;

public class School {

    String name;
    int totalNumOfStudents;
    double avgGpa;

    public School(String name, int totalNumOfStudents, double avgGpa){
        this.name = name;
        this.totalNumOfStudents = totalNumOfStudents;
        this.avgGpa = avgGpa;
    }

//    public School(String inputName, int inputStudents, double inputGpa){
//        name = inputName;
//        totalNumOfStudents = inputStudents;
//        avgGpa = inputGpa;
//    }



    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", totalNumOfStudents=" + totalNumOfStudents +
                ", avgGpa=" + avgGpa +
                '}';
    }
}
