package day37_static.car;

public class Driver {

    String name;
    long licenceNumber;
    char licenceType;


    public Driver(String name, long licenceNumber, char licenceType) {
        this.name = name;
        this.licenceNumber = licenceNumber;
        this.licenceType = licenceType;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", licenceNumber=" + licenceNumber +
                ", licenceType=" + licenceType +
                '}';
    }


}
