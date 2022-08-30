package day36_practice.hobby;

public class Hobby {
//    create a class called Hobby
//
//        - data:
//
//    name, annual cost, is outdoors (boolean), requires others (boolean)

    String name;
    double annualCost;
    boolean isOutdoors;
    boolean needTeam;
//            - constructor

//            - create a constructor that creates a Hobby object with the name

    public Hobby(String name) {
        this.name = name;
    }


//            - create a constructor that creates a Hobby object with the name and annual cost

    public Hobby(String name, double annualCost) {
        this(name);
        this.annualCost = annualCost;
    }

//
//            - create a constructor that creates a Hobby object with the name, annual cost, is outdoors, and requires others

    public Hobby(String name, double annualCost, boolean isOutdoors, boolean needTeam) {
        this(name, annualCost);
        this.isOutdoors = isOutdoors;
        this.needTeam = needTeam;
    }


//        - method:
//
//            - doIt():
//    print: Doing $name-of-hobby $outside-or-inside

    public String doIt(){
        String output = "Doing " + name + " ";
        if(isOutdoors){
            output += "outside";
        }else{
            output += "inside";
        }
       return output;
    }
//    ex: new Hobby("golf", 100, true, false).doIt() -> Doing golf outside
//    ex: new Hobby("puzzles", 50, false, true).doIt() -> Doing puzzles inside
//
//            - toString()
//    print all the Hobby information

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", annualCost=" + annualCost +
                ", isOutdoors=" + isOutdoors +
                ", needTeam=" + needTeam +
                '}';
    }


//    Create a separate class to create and test the Hobby objects
//
//        - create an ArrayList of Hobby objects
//        - create and add a couple Hobby objects
//        - iterate through the ArrayList and execute the doIt() method on each Hobby object
//        - create a copy ArrayList and remove all outdoors Hobbies
//        - create a copy ArrayList and remove all hobbies requiring other people
//        - create a copy ArrayList and remove all hobbies that cost more than $500 annually
}
