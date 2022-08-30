package day27_practice;

public class CharacterMethods {

//     Print each one in one line
//
//    - make method that will print all the letters from A to Z

    public static void AZ(){
        for (char i = 'A'; i <= 'Z' ; i++) {
            System.out.println(i);
        }
    }

//    - make method that will print all the letters from a to z
public static void az(){
    for (char i = 'a'; i <= 'z' ; i++) {
        System.out.println(i);
    }
}

//    - make method that will print all the letters from Z to A
public static void ZA(){
    for (char i = 'Z'; i >= 'A' ; i--) {
        System.out.println(i);
    }
}

//    - make method that will print all the letters from z to a
public static void za(){
    for (char i = 'z'; i >= 'a' ; i--) {
        System.out.println(i);
    }
}


//    - make method that will print all the letters from 0 to 9

    public static void ZeroToNine(){
        String word[] ={"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < 10; i++) {
            System.out.println(word[i]);
        }
        }


    public static void main(String[] args) {
        AZ();
        System.out.println("=================================");
        az();
        System.out.println("=================================");
        ZA();
        System.out.println("=================================");
        za();
        System.out.println("=================================");
        ZeroToNine();
        System.out.println("=================================");
    }





}
