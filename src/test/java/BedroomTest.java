import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom singleRoom;
    Bedroom doubleRoom;
    Bedroom familyRoom;

    Guest guest1;

    @Before
    public void before() {
        singleRoom = new Bedroom(101, BedroomType.SINGLE);
        doubleRoom = new Bedroom(201, BedroomType.DOUBLE);
        familyRoom = new Bedroom(301, BedroomType.FAMILY);
        guest1 = new Guest();
    }

    @Test
    public void canCheckInSingle(){
        singleRoom.checkIn(guest1);
        assertEquals(1, singleRoom.getGuestCount());
    }

    @Test
    public void canCheckInDouble(){
        doubleRoom.checkIn(guest1);
        assertEquals(1, doubleRoom.getGuestCount());
    }

    @Test
    public void canCheckInFamily(){
        familyRoom.checkIn(guest1);
        assertEquals(1, familyRoom.getGuestCount());
    }

    @Test
    public void canCheckGuestInFor2Nights(){
        familyRoom.checkIn(2, guest1);
        assertEquals(2, guest1.getNumberOfnights());
    }

    @Test
    public void canGetTotalRoomCost(){
        familyRoom.checkIn(2, guest1);
        assertEquals(120.00, familyRoom.getTotalCost(), 0.1);
    }
}
