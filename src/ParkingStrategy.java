import java.util.List;

public interface ParkingStrategy {
    ParkingSpot findSpot(List<ParkingSpot> spots);
}