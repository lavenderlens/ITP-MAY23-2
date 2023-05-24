public class ArrayListTest {
    public static void main(String[] args) {
        var alansCars = new CarDealership("Alan's Cars");
        var mokka = new Car("Vauxhall", "Mokka", 22000, "White");
        var escort = new Car("Ford", "Escort", 22000, "White");
        var bentley = new Car("Bentley", "Turbo", 22000, "White");
        var lexus = new Car("Lexus", "400", 22000, "White");

        //add to list of cars in dealership
        alansCars.vehicles.add(mokka);
        alansCars.vehicles.add(escort);
        alansCars.vehicles.add(bentley);
        alansCars.vehicles.add(lexus);

        for(Car car : alansCars.vehicles){
            System.out.println(car.make);
        }
    }
}
