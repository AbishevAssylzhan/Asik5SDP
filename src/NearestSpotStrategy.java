import java.util.List;

public class NearestSpotStrategy implements ParkingStrategy {

    @Override
    public ParkingSpot findSpot(List<ParkingSpot> spots) {
        if (spots.isEmpty()) {
            return null;
        }

        ParkingSpot nearest = spots.get(0);

        for (ParkingSpot spot : spots) {
            if (spot.getDistance() < nearest.getDistance()) {
                nearest = spot;
            }
        }

        return nearest;
    }
}