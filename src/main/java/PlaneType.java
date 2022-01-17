public enum PlaneType {

    BOEING737(100, 20000.00),
    BOEING747(400, 60000.00),
    AIRBUSA350(150, 30000.00);

    private final int capacity;
    private final double maxWeight;

    PlaneType(int _capacity, double _maxWeight){
        this.capacity = _capacity;
        this.maxWeight = _maxWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getMaxWeight() {
        return maxWeight;
    }
}
