package transport;

public class Bus extends Transport{
    public Bus(String brand, String model, int prodYear, String originCountry, String color, int maxSpeed) {
        super(brand, model, prodYear, originCountry, color, maxSpeed);
    }

    @Override
    public void refill(String fuel) {
        if (fuel == "Gasoline" || fuel == "Diesel" ) {
            System.out.println("Refilling with "+validateUtil.validateString(fuel));
        }else {
            System.out.println("Wrong fuel");
        }

    }
}
