public class Car extends Transport{

    public Car(String brand, String model, int prodYear, String originCountry, String color, int maxSpeed){
        super(brand,model,prodYear,originCountry,color,maxSpeed);
    }

    @Override
    public void refill(String fuel) {

        if (fuel == "Gasoline" || fuel == "Diesel" || fuel == "Electricity") {
        System.out.println("Refilling with "+validateUtil.validateString(fuel));
        }else {
            System.out.println("wrong fuel");
        }

    }
}
