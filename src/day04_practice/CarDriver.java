package day04_practice;

public class CarDriver {
    public static void main(String[] args) {
//        create a class CarDriver
//create a main method
//
//    declare and assign these variables with the most appropriate datatypes:
//        driver name, car model, license number, license class, speed, is automatic
//
//    create a summary of the information and print it. Be creative
        //=================================================================

        String driverName = "Alena";
        String carModel = "Toyota";
        int licenceN = 123456789;
        char licenceClass = 'A';
        double speed = 259.5;
        boolean isAutomatic = true;

        System.out.println("Car driver summery: \n");
        System.out.println("Driver's Name is\t"+driverName);
        System.out.println("Car model is\t"+carModel);
        System.out.println("Licence number:\t"+licenceN+", and Licence class is: "+licenceClass);
        System.out.println("Max speed:\t"+speed+" ml/hr");
        System.out.println("Is the car automatic? -\t"+isAutomatic);






    }
}
