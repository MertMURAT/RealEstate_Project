import java.util.ArrayList;
import java.util.List;

public class RealEstateCollection {
    private List<House> houses;
    private List<SummerHouse> summerHouses;
    private List<Villa> villas;

    public RealEstateCollection() {
        houses = new ArrayList<>();
        summerHouses = new ArrayList<>();
        villas = new ArrayList<>();

        houses.add(new House(1000000, 120, 3, 1));
        houses.add(new House(1200000, 150, 4, 1));
        houses.add(new House(90000, 100, 2, 1));

        summerHouses.add(new SummerHouse(1500000, 180, 4, 1));
        summerHouses.add(new SummerHouse(1600000, 200, 4, 1));
        summerHouses.add(new SummerHouse(1700000, 210, 4, 2));

        villas.add(new Villa(3000000, 250, 5, 2));
        villas.add(new Villa(3500000, 300, 6, 2));
        villas.add(new Villa(4000000, 320, 6, 3));
    }

    public List<House> getHouses() {
        return houses;
    }

    public List<SummerHouse> getSummerHouses() {
        return summerHouses;
    }

    public List<Villa> getVillas() {
        return villas;
    }
}
