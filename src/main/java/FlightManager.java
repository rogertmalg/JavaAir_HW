import java.util.ArrayList;

public class FlightManager {

    private static Double baggageWeight;

    public FlightManager() {
        this.baggageWeight = 22.00;
    }

    public static Double getBaggageWeight() {
        return baggageWeight;
    }

    public static void setBaggageWeight(Double _baggageWeight) {
        FlightManager.baggageWeight = _baggageWeight;
    }

    public double reservedBaggageWeightPerPassenger(Flight flight){
        Plane plane = flight.getPlane();
        PlaneType type = plane.getPlaneType();
        int capacity = type.getCapacity();
        double weightForPassengers =  type.getMaxWeight()/2;
        double maxBagsWeightPerPassenger = weightForPassengers/capacity;
        return maxBagsWeightPerPassenger;
    }

    public double totalPassengersBaggageWeight(Flight flight) {
        ArrayList<Passenger> passengers = flight.getPassengers();
        double totalPassengerBagsWeight = 0.0;
        for (Passenger passenger : passengers){
            double passengerBagWeight = passenger.getBagsNumber() * baggageWeight;
            totalPassengerBagsWeight += passengerBagWeight;
        }
        return totalPassengerBagsWeight;
    }

    public double remainingPassengersBagsWeight(Flight flight) {
        Plane plane = flight.getPlane();
        PlaneType type = plane.getPlaneType();
        int capacity = type.getCapacity();
        double reservedWeight =  type.getMaxWeight()/2;;
        double usedWeight = totalPassengersBaggageWeight(flight);
        return reservedWeight - usedWeight;
    }
}
