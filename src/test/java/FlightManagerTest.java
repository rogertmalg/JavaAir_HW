import com.sun.org.glassfish.external.statistics.annotations.Reset;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
    Pilot pilot;
    CabinCrewMember crew1;
    CabinCrewMember crew2;
    CabinCrewMember crew3;
    Passenger passenger;
    Plane plane;
    Flight flight;


    @Before
    public void before() {
        flightManager = new FlightManager();
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
    public void canGetBaggageWeight() {
        assertEquals(22.00, flightManager.getBaggageWeight(), 0.0);
    }

    @Test
    public void canSetBaggageWeight() {
        flightManager.setBaggageWeight(30.00);
        assertEquals(30.00, flightManager.getBaggageWeight(), 0.0);
    }

    @Test
    public void canGetMaxBaggageWeightPerPassenger() {
        double reservedWeightPerPassenger = flightManager.reservedBaggageWeightPerPassenger(flight);
        assertEquals(100.00, reservedWeightPerPassenger, 0.0);
    }

    @Test
    public void canGetTotalPassengersBaggageWeight(){
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        double TotalBagsWeight = flightManager.totalPassengersBaggageWeight(flight);
        assertEquals(88.00, TotalBagsWeight, 0.0);
    }

    @Test
    public void canGetRemainingReservedWeight() {
        int i = 0;
        while (i < 50) {
            flight.bookPassenger(passenger);
            i++;
        }
        assertEquals(7800.00, flightManager.remainingPassengersBagsWeight(flight), 0.0);
    }
}
