public class Passenger extends AbstractPerson {

    private int bagsNumber;

    public Passenger(String _name, int _bagsNumber) {
        super(_name);
        this.bagsNumber = _bagsNumber;
    }

    public int getBagsNumber() {
        return bagsNumber;
    }
}
