import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Bob", 2);
    }

    @Test
    public void canGetName() {
        assertEquals("Bob", passenger.getName());
    }

    @Test
    public void canGetBagsNumber() {
        assertEquals(2, passenger.getBagsNumber());
    }

}
