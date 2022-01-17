import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Karen", Rank.CAPTAIN, "PLT0001");
    }

    @Test
    public void canGetRank() {
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void canGetLicenseNumber() {
        assertEquals("PLT0001", pilot.getLicenseNumber());
    }

    @Test
    public void canFly() {
        assertEquals("Swiiiiish", pilot.fly());
    }
}
