public class Transport {
    ValidateUtil validateUtil = new ValidateUtil();
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

    private String brand;
    private String model;
    private int prodYear;
    private String originCountry;
    private String color;
    private int maxSpeed;

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

    public void setColor(String color) {
        this.color = validateUtil.validateString(color);
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = validateUtil.validateInt(maxSpeed);
    }

    public void setBrand(String brand) {
        this.brand = validateUtil.validateString(brand);
    }

    public void setModel(String model) {
        this.model = validateUtil.validateString(model);
    }

    public void setProdYear(int prodYear) {
        this.prodYear = validateUtil.validateInt(prodYear);
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = validateUtil.validateString(originCountry);
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + ", " + getProdYear() + ", " + getOriginCountry() + ", " + getColor() + ", " + getMaxSpeed() + " km/h\n" +
                "-------------------------------------";
    }
}
