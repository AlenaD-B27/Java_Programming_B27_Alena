package day41_exceptions.try_catch;

public class MultipleCatch {
    public static void main(String[] args) {



        try{
            System.out.println(1/5);

            String s = null;
            s.trim();
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(NullPointerException e){
            System.out.println("Second catch block ");
            e.printStackTrace();
        }

        System.out.println("END");









    }
}
