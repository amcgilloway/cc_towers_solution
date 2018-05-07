public class Bedroom extends Room {

    private int roomNumber;
    private BedroomType type;
    private double totalCost;

    public Bedroom(int roomNumber, BedroomType type) {
        super(type.getCapacity());
        this.roomNumber = roomNumber;
        this.type = type;
        this.totalCost = 0;
    }

    public double getRateFromEnum(){
        return this.type.getNightRate();
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public BedroomType getType() {
        return type;
    }

    public void checkIn(int numberOfNights, Guest guest){
        if(super.roomHasSpace()) {
            guest.setNumberOfnights(numberOfNights);
            super.checkIn(guest);
            this.totalCost = numberOfNights * this.getRateFromEnum();
        }
    }

    public double getTotalCost(){
       return this.totalCost;
    }

}
