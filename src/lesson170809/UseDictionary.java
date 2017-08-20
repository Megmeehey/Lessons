package lesson170809;

import lesson170809.Dictionary.Pair;

import java.util.Random;

public class UseDictionary {
    final static int NUMBER_OF_TESTS = 1000;
    static Random rnd = new Random();

    public static void main(String[] args) {
        Dictionary<String, String> dict = new Dictionary<>();
        String[] brands = {"Acura", "Alfa Romeo", "Aston Martin", "Audi", "Bentley",
                "BMW", "Bugatti", "Buick", "Cadillac", "Chevrolet", "Chrysler", "Citroen", "Dodge",
                "Ferrari", "Fiat", "Ford", "Geely", "General Motors", "GMC", "Honda", "Hyundai",
                "Infiniti", "Jaguar", "Jeep", "Kia", "Koenigsegg", "Lamborghini", "Land Rover",
                "Lexus", "Maserati", "Mazda", "McLaren", "Mercedes-Benz", "Mini", "Mitsubishi",
                "Nissan", "Pagani", "Peugeot", "Porsche", "Ram", "Renault", "Rolls Royce", "Saab",
                "Subaru", "Suzuki", "Tata Motors", "Tesla", "Toyota", "Volkswagen", "Volvo" };

        long startTime, elapsed = 0;
        String carId, car;

        for (int i = 0; i < NUMBER_OF_TESTS; i++) {
            carId = makeCarId();
            car = brands[rnd.nextInt(brands.length - 1)];
            startTime = System.nanoTime();
            dict.put(carId, car);
//            System.out.println("Putting " + carId + " " + car);
            elapsed += System.nanoTime() - startTime;
        }

        System.out.println("Put all: " + elapsed);
        elapsed = 0;

        for (Pair<String, String> pair : dict) {
            startTime = System.nanoTime();
            dict.get(pair.key);
            elapsed += System.nanoTime() - startTime;
        }

        System.out.println("Get all: " + elapsed);
    }

    private static String makeCarId() {
        StringBuilder id = new StringBuilder();
        id.append(randChar()).append(rnd.nextInt(9)).append(rnd.nextInt(9)).append(rnd.nextInt(9))
                .append(randChar()).append(randChar());
        return id.toString();
    }

    private static char randChar() {
        return (char) (65 + rnd.nextInt(25));
    }
}
