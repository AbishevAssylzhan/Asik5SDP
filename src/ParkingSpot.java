public class ParkingSpot {
    private String id;
    private int distance;
    private double price;
    private int size;

    public ParkingSpot(String id, int distance, double price, int size) {
        this.id = id;
        this.distance = distance;
        this.price = price;
        this.size = size;
    }

    public String getId() {
        return id;
    }

    public int getDistance() {
        return distance;
    }

    public double getPrice() {
        return price;
    }

    public int getSize() {
        return size;
    }
}