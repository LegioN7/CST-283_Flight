// CST-283
// Aaron Pelto
// Winter 2024
public class PrepareFlight {
    public static void main(String[] args) {
        // Flight crew object
        FlightCrew theCrew = new FlightCrew("Jane Doe", "Delta Joe");

        // Flight plan object
        FlightPlan thePlan = new FlightPlan("MBS", "DCA");

        // Aircraft object
        Aircraft thePlane = new Aircraft("Boeing777", 350);

        // Passenger list object
        String[] passengers = {"Jen", "Josh", "Sarah", "Rob"};
        PassengerList thePassengers = new PassengerList(passengers);

        // Aggregate all objects into one flight
        Flight myFlight = new Flight(3770, theCrew, thePlane, thePlan, thePassengers);

        System.out.println(myFlight);   // Display flight info
    }

}
