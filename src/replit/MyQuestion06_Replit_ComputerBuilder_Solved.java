package replit;

import java.util.Scanner;

public class MyQuestion06_Replit_ComputerBuilder_Solved {
    public static void main(String[] args) {


Scanner input = new Scanner(System.in);

    double finalPrice = 0;

System.out.println("Select screen size:");
    double screenSize = input.nextDouble();
System.out.println("Select CPU type:");
    String CPU = input.next();
System.out.println("Select RAM size:");
    int RAM = input.nextInt();
System.out.println("Select storage type:");
    String storageType = input.next();
System.out.println("Select storage size:");
    int storageSize = input.nextInt();
System.out.println("Select screen resolution:");
    String resolution = input.next();

        finalPrice += RAM/4*50;

if(screenSize == 13.3){
  finalPrice += 200;
}else if(screenSize == 15.0){
  finalPrice += 300;
}else if(screenSize == 17.3) {
    finalPrice += 400;
}


    switch(CPU){
        case "i3":
            finalPrice += 150;
            break;
        case "i5":
            finalPrice += 250;
            break;
        case "i7":
            finalPrice += 350;
    }


    switch(resolution){
        case "FULLHD":
            finalPrice += 100;
            break;
        case "4K":
            finalPrice += 200;
    }

    switch(storageType){
        case "HDD":
            finalPrice += 50 * storageSize / 500;
            break;
        case "SSD":
            finalPrice += 100 * storageSize / 500;
    }

System.out.println("Final price is: $" + finalPrice );













    }
}
