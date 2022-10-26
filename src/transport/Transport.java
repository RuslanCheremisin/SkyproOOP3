package transport;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final int prodYear;
    private final String originCountry;
    private String color;
    private int maxSpeed;


    public Transport(String brand, String model, int prodYear, String originCountry, String color, int maxSpeed) {

        this.brand = ValidateUtil.validateString(brand);
        this.model = ValidateUtil.validateString(model);
        this.prodYear = ValidateUtil.validateInt(prodYear);
        this.originCountry = ValidateUtil.validateString(originCountry);
        setColor(color);
        setMaxSpeed(maxSpeed);

    }


    public abstract void refill(String fuel);

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProdYear() {
        return prodYear;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    private void setColor(String color) {
        this.color = ValidateUtil.validateString(color);
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = ValidateUtil.validateInt(maxSpeed);
    }


    @Override
    public String toString() {
        return getBrand() + " " + getModel() + ", " + getProdYear() + ", " + getOriginCountry() + ", " + getColor() + ", " + getMaxSpeed() + " km/h\n" +
                "-------------------------------------";
    }
}
