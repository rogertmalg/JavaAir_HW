import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING737);
    }

    @Test
    public void canGetPlaneType() {
        assertEquals(PlaneType.BOEING737, plane.getPlaneType());
    }

    @Test
    public void canGetCapacity() {
        PlaneType type = plane.getPlaneType();
        assertEquals(100, type.getCapacity());
    }

    @Test
    public void canGetMaxWeight() {
        PlaneType type = plane.getPlaneType();
        assertEquals(20000.00, type.getMaxWeight(), 0.0);
    }
}
