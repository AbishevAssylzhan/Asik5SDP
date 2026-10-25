import java.util.List;

public class ParkingContext {

    private ParkingStrategy strategy;

    public ParkingContext(ParkingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(ParkingStrategy strategy) {
        this.strategy = strategy;
    }

    public ParkingSpot findSpot(List<ParkingSpot> spots) {
        return strategy.findSpot(spots);
    }
}