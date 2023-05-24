class ParkingSpace {
    private Vehicle vehicle;
    private boolean isOccupied;

    public ParkingSpace() {
        this.isOccupied = false;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.isOccupied = true;
    }

    public void removeVehicle() {
        this.vehicle = null;
        this.isOccupied = false;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}