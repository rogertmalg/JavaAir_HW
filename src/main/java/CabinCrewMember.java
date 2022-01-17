public class CabinCrewMember extends AbstractPerson {

    private Rank rank;

    public CabinCrewMember(String _name, Rank _rank){
        super(_name);
        this.rank = _rank;
    }

    public Rank getRank() {
        return rank;
    }

    public String announce(String _announcement) {
        return _announcement;
    }

}
