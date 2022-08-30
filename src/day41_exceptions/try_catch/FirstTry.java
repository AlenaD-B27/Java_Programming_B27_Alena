package day41_exceptions.try_catch;

public class FirstTry {
    public static void main(String[] args) {

        try{

            String s = "hello world";
            System.out.println(s.charAt(5));
            System.out.println(s.charAt(1));

        } catch (StringIndexOutOfBoundsException e){ // e is a parameter name
            System.out.println("The String was too short. It went out of bounds");
        } // catch block only runs if an exception happens

        System.out.println("Hello");

        try{
            Thread.sleep(5000); // 5000 means 5 seconds, the parameter is milliseconds
        }catch (Exception e){
            System.out.println("Invalid time given");
        }

        System.out.println("World");

    }
}
