public class ConferenceRoom extends Room {

    private double dayRate;
    private String name;

    public ConferenceRoom(String name, int capacity, double dayRate) {
        super(capacity);
        this.name = name;
        this.dayRate = dayRate;
    }

    public String getName() {
        return name;
    }

    public double getDayRate() {
        return dayRate;
    }
}
