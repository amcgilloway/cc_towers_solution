import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;

    public Room(int capacity){
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public int getGuestCount(){
        return this.guests.size();
    }

    public void checkIn(Guest guest){
        if (roomHasSpace()) {
            this.guests.add(guest);
        }
    }

    public boolean roomHasSpace(){
        return this.getGuestCount() < this.capacity;
    }
}
