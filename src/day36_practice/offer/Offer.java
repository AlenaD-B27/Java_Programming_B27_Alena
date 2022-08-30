package day36_practice.offer;

public class Offer {
//    create a class called Offer
//
//        - data:
//    company, location, salary, is full time, number of PTO

    String company;
    String location;
    double salary;
    boolean isFullTime;
    int numberOfPTO;


//        - constructor
//            - create a constructor that creates an Offer object with the company and location

    public Offer(String company, String location) {
        this.company = company;
        this.location = location;
    }


//            - create a constructor that creates an Offer object with the company, location, and salary

    public Offer(String company, String location, double salary) {
        this(company, location);
        this.salary = salary;
    }


//            - create a constructor that creates an Offer object with the company, location, salary, is full time, and number of PTO

    public Offer(String company, String location, double salary, boolean isFullTime, int numberOfPTO) {
        this(company, location, salary);
        this.isFullTime = isFullTime;
        this.numberOfPTO = numberOfPTO;
    }


//        - method:
//    toString()
//    print all the employees information

    @Override
    public String toString() {
        return "Offer{" +
                "company='" + company + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                ", numberOfPTO=" + numberOfPTO +
                '}';
    }

//    Create a separate class to create and test the Offer objects
//
//            create multiple Offer objects and store them into an ArrayList of Offers. Create multiple other Lists to filter out different information:
//
//    write a program that can only keep the offers from local area
//
//    write a program that can remove all offers that are not for SDET or QA
//
//    write a program that can remove the offers that are not full Time
//
//    write a program that removes all offer that are less than 100,000 salary
//
//        - Find the biggest and lowest salary Offers and print the whole object

}
