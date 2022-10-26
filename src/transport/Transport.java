package transport;

public abstract class Transport {
    private String brand;
    private String model;
    private int prodYear;
    private String originCountry;
    private String color;
    private int maxSpeed;


    public Transport(){

    }



    public Transport(String brand, String model, int prodYear, String originCountry, String color, int maxSpeed) {

        setBrand(brand);
        setModel(model);
        setProdYear(prodYear);
        setOriginCountry(originCountry);
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

    private void setBrand(String brand) {
        this.brand = ValidateUtil.validateString(brand);
    }

    private void setModel(String model) {
        this.model = ValidateUtil.validateString(model);
    }

    private void setProdYear(int prodYear) {
        this.prodYear = ValidateUtil.validateInt(prodYear);
    }

    private void setOriginCountry(String originCountry) {
        this.originCountry = ValidateUtil.validateString(originCountry);
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + ", " + getProdYear() + ", " + getOriginCountry() + ", " + getColor() + ", " + getMaxSpeed() + " km/h\n" +
                "-------------------------------------";
    }
}
