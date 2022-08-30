package day34_custom_classes.house;

public class Market {
    public static void main(String[] args) {

        House house1 = new House();
        System.out.println(house1);

        house1.type = "Townhouse";
        house1.squareFeet = 1300;
        house1.numberOfBathrooms = 2;
        house1.numberOfBedrooms = 3;
        house1.inCity = false;
        house1.hasGarage = true;

        System.out.println(house1);

        System.out.println(house1.calculateMortgage());





    }
}
