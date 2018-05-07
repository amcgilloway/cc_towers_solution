public enum BedroomType {

    SINGLE(1, 25.00),
    DOUBLE(2, 40.00),
    FAMILY(4, 60.00);

    private int capacity;
    private double nightRate;

    BedroomType(int capacity, double nightRate) {
        this.capacity = capacity;
        this.nightRate = nightRate;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getNightRate() {
        return nightRate;
    }
}
