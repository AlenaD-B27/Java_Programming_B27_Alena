package day16_string;

public class Email {
    public static void main(String[] args) {
        /* saim@cydeo.com

        name -> saim
        domain -> cydeo

         */

        String email = "saim@cydeo.com";
        int indexOfAt = email.indexOf('@');
        String name = email.substring(0, indexOfAt);
        int indexOfDot = email.lastIndexOf('.');
        String domain = email.substring(indexOfAt + 1, indexOfDot);
        System.out.println("name = " + name);
        System.out.println("domain = " + domain);


    }
}
