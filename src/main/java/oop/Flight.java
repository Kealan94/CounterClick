package oop;

public class Flight {
    private int number;
    private String departsFrom;
    private String destination;
    private int departureTime;

    //Constructor
    public Flight(int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDepartsFrom() {
        return departsFrom;
    }

    public void setDepartsFrom(String departsFrom) {
        this.departsFrom = departsFrom;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "number=" + number +
                ", departsFrom='" + departsFrom + '\'' +
                ", destination='" + destination + '\'' +
                ", departureTime=" + departureTime +
                '}';
    }
}

