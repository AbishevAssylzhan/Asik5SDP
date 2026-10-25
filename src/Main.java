import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<ParkingSpot> spots = Arrays.asList(
                new ParkingSpot("A1", 100, 500, 15),
                new ParkingSpot("A2", 50, 300, 20),
                new ParkingSpot("A3", 200, 200, 25)
        );

        ParkingContext context =
                new ParkingContext(new NearestSpotStrategy());

        ParkingSpot nearest = context.findSpot(spots);
        System.out.println("Nearest spot: " + nearest);

        context.setStrategy(new CheapestSpotStrategy());

        ParkingSpot cheapest = context.findSpot(spots);
        System.out.println("Cheapest spot: " + cheapest);

        context.setStrategy(new LargestSpotStrategy());

        ParkingSpot largest = context.findSpot(spots);
        System.out.println("Largest spot: " + largest);
    }
}