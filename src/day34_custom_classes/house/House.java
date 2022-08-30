package day34_custom_classes.house;

public class House {

    String type;
    double squareFeet;
    int numberOfBedrooms;
    int numberOfBathrooms;
    boolean inCity;
    boolean hasGarage;

    public double calculateMortgage(){
        if(numberOfBedrooms < 2){
            return 1500;
        }else if (numberOfBedrooms < 4 ){
            return 2000;
        }else {
            return 2500;
        }
    }


    public String toString() {
        return "House{" +
                "type='" + type + '\'' +
                ", squareFeet=" + squareFeet +
                ", numberOfBedrooms=" + numberOfBedrooms +
                ", numberOfBathrooms=" + numberOfBathrooms + ", " +
                (inCity ? "In the City" : "In suburbs") + ", " +
                (hasGarage ? "has garage" : "No garage. Street parking") +
                '}';
    }
}
