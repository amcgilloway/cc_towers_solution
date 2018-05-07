import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<DiningRoom> dininRooms;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms, ArrayList<DiningRoom> diningRooms) {

        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
        this.dininRooms = diningRooms;
    }

    public void checkIntoBedRoom(int roomnumber, Guest guest, int numberOfNights) {
        for (Bedroom bedroom : this.bedrooms) {
            if (roomnumber == bedroom.getRoomNumber()) {
                bedroom.checkIn(numberOfNights, guest);
            }
        }
    }

    public void checkIntoConferenceRoom(String name, Guest guest) {
        for (ConferenceRoom room : this.conferenceRooms) {
            if (room.getName().equals(room.getName())) {
                room.checkIn(guest);
            }
        }
    }

    public void checkIntoDiningRoom(Guest guest) {
        for (DiningRoom room : this.dininRooms) {
            room.checkIn(guest);
        }
    }

    public ArrayList<Bedroom> getEmptyBedrooms() {
        ArrayList<Bedroom> emptyRooms = new ArrayList<>();
        for (Bedroom room : this.bedrooms) {
            if (room.getGuestCount() == 0) {
                emptyRooms.add(room);
            }
        }
        return emptyRooms;
    }
}
