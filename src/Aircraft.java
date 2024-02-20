
// Aircraft object
// Aircraft thePlane = new Aircraft("Boeing777",350);
public class Aircraft {

    String planeType;
    int seatCapacity;

    public Aircraft() {
        planeType = "";
        seatCapacity = 0;
    }

    public Aircraft(String type, int capacity) {
        planeType = type;
        seatCapacity = capacity;
    }

    public String toString() {
        return "Aircraft: " + planeType + " with " + seatCapacity + " seats";
    }
}
