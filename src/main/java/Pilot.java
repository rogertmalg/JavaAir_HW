public class Pilot extends AbstractPerson {

    private Rank rank;
    private String licenseNumber;

    public Pilot(String _name, Rank _rank, String _licenseNumber) {
        super(_name);
        this.rank = _rank;
        this.licenseNumber = _licenseNumber;
    }

    public Rank getRank() {
        return rank;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public String fly() {
        return "Swiiiiish";
    }
}
