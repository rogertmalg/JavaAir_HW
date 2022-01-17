import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Calendar;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Pilot pilot;
    CabinCrewMember crew1;
    CabinCrewMember crew2;
    CabinCrewMember crew3;
    Passenger passenger;
    Plane plane;
    Flight flight;

    @Before
    public void before() {
        pilot = new Pilot("Karen", Rank.CAPTAIN, "PLT0001");
        crew1 = new CabinCrewMember("Janet", Rank.FLIGHT_ATTENDANT);
        crew2 = new CabinCrewMember("Paul", Rank.FLIGHT_ATTENDANT);
        crew3 = new CabinCrewMember("Sarah", Rank.FIRST_OFFICER);
        passenger = new Passenger("Bob", 2);
        plane = new Plane(PlaneType.BOEING737);
        flight = new Flight(pilot, crew1, crew2, crew3, plane, "EDI013", "Rio de Janeiro",
                "EDI", Calendar.getInstance().getTime());
    }

    @Test
    public void canGetNumberOfPilots() {
        assertEquals(1, flight.getNumberOfPilots());
    }

    @Test
    public void canGetNumberOfCabinCrewMembers() {
        assertEquals(3, flight.getNumberOfCabinCrewMembers());
    }

    @Test
    public void canGetNumberOfPassengers() {
        assertEquals(0, flight.getNumberOfPassengers());
    }

    @Test
    public void canGetPlane() {
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void canGetFlightNumber() {
        assertEquals("EDI013", flight.getFlightNumber());
    }

    @Test
    public void canGetDestination() {
        assertEquals("Rio de Janeiro", flight.getDestination());
    }

    @Test
    public void canGetDepAirport() {
        assertEquals("EDI", flight.getDepAirport());
    }

    @Test
    public void canGetDepTime() {
        assertEquals(Calendar.getInstance().getTime(), flight.getDepTime());
    }

    @Test
    public void canBookPassenger() {
        flight.bookPassenger(passenger);
        assertEquals(1, flight.getNumberOfPassengers());
    }

    @Test
    public void cantBookPassengerIfFull() {
        int i = 0;
        while (i < 110) {
            flight.bookPassenger(passenger);
            i++;
        }
        assertEquals(100, flight.getNumberOfPassengers());
    }

    @Test
    public void canGetNumberOfAvailableSeats() {
        int i = 0;
        while (i < 80) {
            flight.bookPassenger(passenger);
            i++;
        }
        assertEquals(20, flight.numberAvailableSeats());
    }
}
