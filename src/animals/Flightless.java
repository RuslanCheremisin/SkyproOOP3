package animals;

public class Flightless extends Birds{
    private String species;

    private String movementType;

    public Flightless(String species, String name, int age, String habitatArea, String movementType){
        super(name, age, habitatArea);
        setMovementType(movementType);
        setSpecies(species);
    }

    @Override
    public void eat() {
        System.out.println(species+" "+getName()+" ест");

    }

    @Override
    public void sleep() {
        System.out.println(species+" "+getName()+" спит в "+getHabitatArea());

    }

    @Override
    public void move() {
        System.out.println(species+" "+getName()+" перемещается по "+getMovementType());

    }

    @Override
    public void hunt() {
        System.out.println(species+" "+getName()+" добывает пищу в "+getHabitatArea());

    }

    public void walk(){
        System.out.println(species+" "+getName()+" гуляет по "+getHabitatArea());

    }
    public String getSpecies() {
        return species;
    }

    private void setSpecies(String species) {
        this.species = ValidateUtil.validateString(species);
    }

    public String getMovementType() {
        return movementType;
    }

    private void setMovementType(String movementType) {
        this.movementType = ValidateUtil.validateString(movementType);
    }
    @Override
    public String toString(){
        return species+" по кличке "+ getName() + "\n" +
                "Возраст: " + getAge() + "\n" +
                "География обитания: " + getHabitatArea()+ "\n" +
                "Способ передвижения: "+getMovementType()+ "\n" +
                "--------------------------------------------------------\n";
    }
}
