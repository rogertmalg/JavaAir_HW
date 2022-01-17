import java.util.ArrayList;
import java.util.Date;

public class Flight{

    private Pilot[] pilots;
    private CabinCrewMember[] cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String depAirport;
    private Date depTime;

    public Flight(Pilot _pilot, CabinCrewMember _crew1, CabinCrewMember _crew2, CabinCrewMember _crew3, Plane _plane,
                  String _flightNumber, String _destination, String _depAirport, Date _depTime) {
        this.pilots = new Pilot[]{_pilot};
        this.cabinCrewMembers = new CabinCrewMember[]{_crew1, _crew2, _crew3};
        this.passengers = new ArrayList<Passenger>();
        this.plane = _plane;
        this.flightNumber = _flightNumber;
        this.destination = _destination;
        this.depAirport = _depAirport;
        this.depTime = _depTime;
    }

    public int getNumberOfPilots() {
        return pilots.length;
    }

    public int getNumberOfCabinCrewMembers() {
        return cabinCrewMembers.length;
    }

    public int getNumberOfPassengers() {
        return passengers.size();
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    } // test it

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepAirport() {
        return depAirport;
    }

    public Date getDepTime() {
        return depTime;
    }

    public int numberAvailableSeats() {
        PlaneType type = plane.getPlaneType();
        int capacity = type.getCapacity();
        int numberOfPassengers = getNumberOfPassengers();
        int seatsAvailable = capacity - numberOfPassengers;
        return seatsAvailable;
    }

    public void bookPassenger(Passenger _passenger){
        PlaneType type = plane.getPlaneType();
        int capacity = type.getCapacity();
        if (capacity > getNumberOfPassengers()){
            passengers.add(_passenger);
        }
    }
}
