import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before() {
        cabinCrewMember = new CabinCrewMember("Janet", Rank.FLIGHT_ATTENDANT);
    }

    @Test
    public void canGetRank() {
        assertEquals(Rank.FLIGHT_ATTENDANT, cabinCrewMember.getRank());
    }

    @Test
    public void canAnnounce() {
        String announcement = cabinCrewMember.announce("Hello, welcome to your JavaAir flight");
        assertEquals("Hello, welcome to your JavaAir flight", announcement);
    }
}
