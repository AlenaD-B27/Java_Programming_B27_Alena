package day27_practice;

public class VoidMethods {
    /*
       create a method that can print odd numbers between 1-100 in the
same line saperated by space

create a method that can print even numbers between 1-100 in the
same line saperated by space

        */
    public static void Even(){
        String evens = "";
        for (int i = 1; i <= 100 ; i++) {
            if(i%2==0){
                evens += i + " ";
            }
        }
        System.out.println(evens);
    }
    public static void Odd(){
        String odds = "";
        for (int i = 1; i <= 100 ; i++) {
            if(i%2!=0){
                odds += i + " ";
            }
        }
        System.out.println(odds);
    }

    public static void main(String[] args) {
        Even();
        Odd();
    }


}
