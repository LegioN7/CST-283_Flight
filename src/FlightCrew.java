public class FlightCrew {
    private final String captain;
    private final String firstOfficer;

    public FlightCrew() {
        captain = "";
        firstOfficer = "";
    }

    public FlightCrew(String c, String f) {
        captain = c;
        firstOfficer = f;
    }

    public String toString() {
        return "FlightCrew: Captain - " + captain + ", First officer - " + firstOfficer;
    }
}

