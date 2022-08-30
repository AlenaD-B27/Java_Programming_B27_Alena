package day38_encapsulation.flight;

public class FlightTicket {
    private String type;
    private String departure;
    private String arrival;

    public FlightTicket(String type, String departure, String arrival) {
        setType(type);
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {

        if(type.equals("first") || type.equals("economy") || type.equals("business")){
            this.type = type;
        }

    }
    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }





}
