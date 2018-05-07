import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    private DiningRoom diningRoom;
    private Guest guest;

    @Before
    public void before(){
        diningRoom = new DiningRoom(50);
        guest = new Guest();
    }

    @Test
    public void canCheckIn(){
        diningRoom.checkIn(guest);
        assertEquals(1, diningRoom.getGuestCount());
    }

    @Test
    public void cannotCheckInMoreThanCapactiy(){
        for(int i = 1; i <= diningRoom.getCapacity(); i++){
            diningRoom.checkIn(guest);
        }
        assertEquals(50, diningRoom.getGuestCount());
        diningRoom.checkIn(guest);
        assertEquals(50, diningRoom.getGuestCount());
    }


}
