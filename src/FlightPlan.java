public class FlightPlan {
    private final String sourceAirport;
    private final String destinationAirport;

    public FlightPlan() {
        sourceAirport = "";
        destinationAirport = "";
    }

    public FlightPlan(String from, String to) {
        sourceAirport = from;
        destinationAirport = to;
    }

    public String toString() {
        return "Flight is from: " + sourceAirport + " ==> " + destinationAirport;
    }
}

