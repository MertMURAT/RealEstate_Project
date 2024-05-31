import java.util.ArrayList;
import java.util.List;

public class RealEstateService {

    private final RealEstateCollection realEstateCollection;

    public RealEstateService(RealEstateCollection realEstateCollection) {
        this.realEstateCollection = realEstateCollection;
    }

    public double getTotalPriceOfHouses() {
        return realEstateCollection.getHouses()
                .stream()
                .mapToDouble(house -> house.getPrice())
                .sum();
    }

    public double getTotalPriceOfVillas() {
        return realEstateCollection.getVillas()
                .stream()
                .mapToDouble(House::getPrice)
                .sum();
    }

    public double getTotalPriceOfSummerHouses() {
        return realEstateCollection.getSummerHouses()
                .stream()
                .mapToDouble(House::getPrice)
                .sum();
    }

    public double getTotalPriceAllHouseTypes() {
        return getTotalPriceOfHouses() + getTotalPriceOfVillas() + getTotalPriceOfSummerHouses();
    }

    public double getAverageSquareMetersOfHouses() {
        return realEstateCollection.getHouses()
                .stream()
                .mapToDouble(House::getSquareMeters)
                .average()
                .orElse(0);
    }

    public double getAverageSquareMetersOfVillas() {
        return realEstateCollection.getVillas()
                .stream()
                .mapToDouble(Villa::getSquareMeters)
                .average()
                .orElse(0);
    }

    public double getAverageSquareMetersOfSummerHouses() {
        return realEstateCollection.getSummerHouses()
                .stream()
                .mapToDouble(SummerHouse::getSquareMeters)
                .average()
                .orElse(0);
    }

    public double getAverageSquareMetersAllHouseTypes() {
        double totalSquareMeters
                = realEstateCollection.getHouses().stream().mapToDouble(House::getSquareMeters).sum()
                + realEstateCollection.getVillas().stream().mapToDouble(Villa::getSquareMeters).sum()
                + realEstateCollection.getSummerHouses().stream().mapToDouble(SummerHouse::getSquareMeters).sum();

        int totalHouseSizes = realEstateCollection.getHouses().size()
                + realEstateCollection.getVillas().size()
                + realEstateCollection.getSummerHouses().size();

        return totalSquareMeters / totalHouseSizes;
    }

    public List<House> filterHousesByRoomAndLivingRoomCount(int rooms, int livingRooms) {
        List<House> allHouses = new ArrayList<>();
        allHouses.addAll(realEstateCollection.getHouses());
        allHouses.addAll(realEstateCollection.getVillas());
        allHouses.addAll(realEstateCollection.getSummerHouses());

        return allHouses
                .stream()
                .filter(house -> house.getRooms() == rooms && house.getLivingRooms() == livingRooms)
                .toList();
    }


}
