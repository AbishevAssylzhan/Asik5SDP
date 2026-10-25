import java.util.List;

public class LargestSpotStrategy implements ParkingStrategy {

    @Override
    public ParkingSpot findSpot(List<ParkingSpot> spots) {
        if (spots.isEmpty()) {
            return null;
        }

        ParkingSpot largest = spots.get(0);

        for (ParkingSpot spot : spots) {
            if (spot.getSize() > largest.getSize()) {
                largest = spot;
            }
        }

        return largest;
    }
}