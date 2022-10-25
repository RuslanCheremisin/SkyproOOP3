public class Train extends Transport{
    private int ticketPrice;
    private int travelTimeHours;
    private String startStation;
    private String endStation;
    private int numberOfTrainCars;

    public Train(String brand, String model, int prodYear, String originCountry, int maxSpeed, int ticketPrice, int travelTimeHours, String startStation, String endStation, int numberOfTrainCars) {
        super(brand,model,prodYear,originCountry,null,maxSpeed);
//        setBrand(brand);
//        setModel(model);
//        setProdYear(prodYear);
//        setOriginCountry(originCountry);
//        setMaxSpeed(maxSpeed);
//        ValidateUtil validateUtil = new ValidateUtil();

        setTicketPrice(ticketPrice);
        setTravelTimeHours(travelTimeHours);
        setStartStation(startStation);
        setEndStation(endStation);
        setNumberOfTrainCars(numberOfTrainCars);
    }

    public Train() {

    }
    @Override
    public String toString() {
        return getBrand() + " " + getModel() + ", " + getProdYear() + ", " + getOriginCountry() + ", " + getMaxSpeed() + " km/h. "+"Ticket price = "+ticketPrice+".\n" +
                "Travel time: "+travelTimeHours+" hours. Starting station: "+startStation+". End station: "+ endStation+". Number of traincars: "+numberOfTrainCars+"\n" +
                "-------------------------------------------";
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = validateUtil.validateInt(ticketPrice);;
    }

    public int getTravelTimeHours() {
        return travelTimeHours;
    }

    public void setTravelTimeHours(int travelTimeHours) {
        this.travelTimeHours = validateUtil.validateInt(travelTimeHours);
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        this.startStation = validateUtil.validateString(startStation);
    }

    public String getEndStation() {
        return endStation;
    }

    public void setEndStation(String endStation) {
        this.endStation = validateUtil.validateString(endStation);
    }

    public int getNumberOfTrainCars() {
        return numberOfTrainCars;
    }

    public void setNumberOfTrainCars(int numberOfTrainCars) {
        this.numberOfTrainCars = validateUtil.validateInt(numberOfTrainCars);
    }
}
