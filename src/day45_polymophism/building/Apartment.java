package day45_polymophism.building;

public class Apartment extends Building implements HasBalcony {


    /*
    Create an class Apartment
    child class of Building
    implements HasBalcony

    create instance variable
        int months of lease

    create a constructor to assign the location, price, and months of lease

    implement all abstract methods (give some print statements)

    override the toString to print the location, price, and months of lease
     */


    int monthsOfLease;

    public Apartment(String location, double price, int monthsOfLease) {
        super(location, price);
        this.monthsOfLease = monthsOfLease;
    }

    @Override
    public void pay() {
        System.out.println("Paying rent for apartment");
    }

    @Override
    public void openBalcony() {
        System.out.println("Opening door for balcony");
    }

    public String toString(){
        return super.toString() + " Month of lease: " + monthsOfLease;
    }
}
