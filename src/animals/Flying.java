package animals;

public class Flying extends Birds{
    private String species;

    private String movementType;

    public Flying(String species, String name, int age, String habitatArea, String movementType){
        super(name, age, habitatArea);
        setMovementType(movementType);
        setSpecies(species);
    }
    @Override
    public void eat(){
        System.out.println(species+" "+getName()+" ест");

    }
    @Override
    public void sleep(){
        System.out.println(species+" "+getName()+" спит в "+getHabitatArea());

    }
    @Override
    public void move(){
        System.out.println(species+" "+getName()+" перемещается по "+getMovementType());

    }

    @Override
    public void hunt(){
        System.out.println(species+" "+getName()+" охотится в "+getHabitatArea());

    }
    public void fly(){
        System.out.println(species+" "+getName()+" летает по "+getHabitatArea());

    }
    public String getSpecies() {
        return species;
    }

    private void setSpecies(String species) {
        this.species = validateUtil.validateString(species);
    }
    private void setMovementType(String movementType) {
        this.movementType = validateUtil.validateString(movementType);
    }

    public String getMovementType() {
        return movementType;
    }

    @Override
    public String toString(){
        return species+" по кличке " + getName() + "\n" +
                "Возраст: " + getAge() + "\n" +
                "География обитания: " + getHabitatArea()+ "\n" +
                "Способ передвижения: "+getMovementType()+ "\n" +
                "--------------------------------------------------------\n";
    }
}
