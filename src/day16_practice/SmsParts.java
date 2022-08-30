package day16_practice;

public class SmsParts {
    public static void main(String[] args) {
//        Given a String in the following format:
String message = new String ("Sender: <James Bond>. From Number: [202-123-3456]. + Message: {\"I love programming and problem solving\"}");
        System.out.println("message = " + message);
//        Separate these parts and print them separately:
//        Sender: actualSender
        int whereNameStarts = message.indexOf('<');
        int whereNameEnds = message.indexOf('>');
        String actualSender = new String (message.substring(whereNameStarts+1,whereNameEnds));
        System.out.println("Sender: " + actualSender);

//        Number: actualNumber

        int whereNumberStarts = message.indexOf('[');
        int whereNumberEnds = message.indexOf(']');
        String actualNumber = new String (message.substring(whereNumberStarts+1,whereNumberEnds));
        System.out.println("Number: " + actualNumber);

//        Message: actualMessage

        int whereSMSStarts = message.indexOf('{');
        int whereSMSEnds = message.indexOf('}');
        String actualSMS = new String (message.substring(whereSMSStarts+1,whereSMSEnds));
        System.out.println("Message: " + actualSMS);











    }
}
