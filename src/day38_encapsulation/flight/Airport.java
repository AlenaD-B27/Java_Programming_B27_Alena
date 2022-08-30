package day38_encapsulation.flight;

import day38_encapsulation.flight.FlightTicket;

public class Airport {
    public static void main(String[] args) {
        FlightTicket ticket1 = new FlightTicket("first", "Chicago", "Virginia");
        System.out.println(ticket1.getType());
        System.out.println(ticket1.getDeparture());
        System.out.println(ticket1.getArrival());

        FlightTicket ticket2 = new FlightTicket("flying", "New York", "Canada");
        System.out.println(ticket2.getType()); // null

        ticket2.setType("economy");
        System.out.println(ticket2.getType());


    }
}
