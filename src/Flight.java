public class Flight {
    private final int flightNumber;

    private final FlightCrew theCrew;
    private final Aircraft thePlane;
    private final FlightPlan flightPlan;
    private final PassengerList thePassengers;

    public Flight() {
        flightNumber = 0;
        theCrew = new FlightCrew();
        thePlane = new Aircraft();
        flightPlan = new FlightPlan();
        thePassengers = new PassengerList();
    }

    public Flight(int f, FlightCrew crew, Aircraft plane, FlightPlan plan, PassengerList pList) {
        flightNumber = f;
        theCrew = crew;
        thePlane = plane;
        flightPlan = plan;
        thePassengers = pList;
    }

    public String toString() {
        return "Flight: " + flightNumber + "\n" +
                theCrew.toString() + "\n" +
                thePlane.toString() + "\n" +
                flightPlan.toString() + "\n" +
                thePassengers.toString();
    }
}