//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        RealEstateCollection realEstateCollection = new RealEstateCollection();
        RealEstateService realEstateService = new RealEstateService(realEstateCollection);

        System.out.println("Evlerin toplam fiyatı: " + realEstateService.getTotalPriceOfHouses());
        System.out.println("Villaların toplam fiyatı: " + realEstateService.getTotalPriceOfVillas());
        System.out.println("Yazlıkların toplam fiyatı: " + realEstateService.getTotalPriceOfSummerHouses());
        System.out.println("Tüm ev tiplerinin toplam fiyatı: " + realEstateService.getTotalPriceAllHouseTypes());

        System.out.println("Evlerin ortalama metrekaresi: " + realEstateService.getAverageSquareMetersOfHouses());
        System.out.println("Villaların ortalama metrekaresi: " + realEstateService.getAverageSquareMetersOfVillas());
        System.out.println("Yazlıkların ortalama metrekaresi: " + realEstateService.getAverageSquareMetersOfSummerHouses());
        System.out.println("Tüm ev tiplerinin ortalama metrekaresi: " + realEstateService.getAverageSquareMetersAllHouseTypes());

        int rooms = 4;
        int livingrooms = 1;
        System.out.println(rooms + " odalı ve " + livingrooms + " salonlu tüm menkuller: "
        + realEstateService.filterHousesByRoomAndLivingRoomCount(rooms, livingrooms));
    }
}
