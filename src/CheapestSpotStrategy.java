import java.util.List;

public class CheapestSpotStrategy implements ParkingStrategy {

    @Override
    public ParkingSpot findSpot(List<ParkingSpot> spots) {
        if (spots.isEmpty()) {
            return null;
        }

        ParkingSpot cheapest = spots.get(0);

        for (ParkingSpot spot : spots) {
            if (spot.getPrice() < cheapest.getPrice()) {
                cheapest = spot;
            }
        }

        return cheapest;
    }
}