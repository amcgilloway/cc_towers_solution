import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Bedroom singleRoom;
    Bedroom doubleRoom;
    Bedroom familyRoom;
    ConferenceRoom conference;
    DiningRoom diningRoom;
    Hotel hotel;
    Guest guest1;

    @Before
    public void before(){
         singleRoom = new Bedroom(101, BedroomType.SINGLE);
         doubleRoom = new Bedroom(201, BedroomType.DOUBLE);
         familyRoom = new Bedroom(301, BedroomType.FAMILY);
         ArrayList<Bedroom> bedrooms = new ArrayList<>();
         bedrooms.add(singleRoom);
         bedrooms.add(doubleRoom);
         bedrooms.add(familyRoom);
         ArrayList<ConferenceRoom> conferenceRooms = new ArrayList<>();
         conference = new ConferenceRoom("Glamis", 50, 100.00);
         conferenceRooms.add(conference);
         ArrayList<DiningRoom> diningRooms = new ArrayList<>();
         diningRoom = new DiningRoom(20);
         diningRooms.add(diningRoom);
         ArrayList<Bedroom> copy = new ArrayList<>(bedrooms);
         hotel = new Hotel(bedrooms, conferenceRooms, diningRooms);
         guest1 = new Guest();
    }

    @Test
    public void canCheckGuestIntoSingleRoom(){
        hotel.checkIntoBedRoom(101, guest1, 1);
        assertEquals(1, singleRoom.getGuestCount());
    }

    @Test
    public void canCheckGuestInFor2Nights(){
        hotel.checkIntoBedRoom(301,guest1, 2);
        assertEquals(1, familyRoom.getGuestCount());
        assertEquals(2,guest1.getNumberOfnights());
    }

    @Test
    public void canCheckGuestsIntoConferenceRoom(){
        hotel.checkIntoConferenceRoom("Glamis",guest1);
        assertEquals(1, conference.getGuestCount());
    }

    @Test
    public void canCHeckGuestIntoDinignRoom(){
        hotel.checkIntoDiningRoom(guest1);
        assertEquals(1, diningRoom.getGuestCount());
    }

    @Test
    public void cantCheckMoreThan1GuestIntoSingle(){
        hotel.checkIntoBedRoom(101, guest1, 1);
        hotel.checkIntoBedRoom(101, guest1, 1);
        assertEquals(1, singleRoom.getGuestCount());
    }

    @Test
    public void canGetEmptyBedrooms(){
        hotel.checkIntoBedRoom(101, guest1, 1);
        hotel.checkIntoBedRoom(201, guest1, 1);
        ArrayList<Bedroom> empty = hotel.getEmptyBedrooms();
        assertEquals(1, empty.size());
        assertEquals(BedroomType.FAMILY, empty.get(0).getType());
    }

}
