import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom("Glasmis", 100, 150.00);
        guest = new Guest();
    }

    @Test
    public void canCheckinGuest(){
        conferenceRoom.checkIn(guest);
        assertEquals(1, conferenceRoom.getGuestCount());
    }

    @Test
    public void cannotCheckInMoreThanCapacity(){
        for(int i = 1; i <= conferenceRoom.getCapacity(); i++){
            conferenceRoom.checkIn(guest);
        }
        assertEquals(100, conferenceRoom.getGuestCount());
        conferenceRoom.checkIn(guest);
        assertEquals(100, conferenceRoom.getGuestCount());
    }

    @Test
    public void canGetDailyRate(){
        assertEquals(150.0, conferenceRoom.getDayRate(), 0.1);
    }
}
