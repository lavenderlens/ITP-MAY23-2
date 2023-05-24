public class RunCar {
    public static void main(String[] args) {
        Car c = new Car();
        var mokka = new Car("Vauxhall", "Mokka", 22000, "white");
        System.out.println(c);
        //Car@1134affc
        // OR, with toString() override
        //Car{make='null', model='null', mileage=0, colour='null'}
        System.out.println(mokka);
        //Car{make='Vauxhall', model='Mokka', mileage=22000, colour='white'}
    }
}
