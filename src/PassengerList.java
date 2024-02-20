public class PassengerList {
    final int PLANE_CAPACITY = 100;

    String[] passengers;
    int numPassengers;

    public PassengerList() {
        passengers = new String[PLANE_CAPACITY];
    }

    public PassengerList(String[] passList) {
        passengers = passList;
        numPassengers = passengers.length;
    }

    public String toString() {
        String returnString = "Passengers: " + "\n";

        for (int i = 0; i < numPassengers; i++) {
            returnString += passengers[i] + "\n";
        }
        return returnString;
    }
}

