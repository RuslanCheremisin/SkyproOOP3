package animals;

public class Herbivores extends Mammals{
    private String species;

    private String foodType;

    public Herbivores(String species, String name, int age, String habitatArea, int movementSpeed,String foodType) {
        super(name, age, habitatArea, movementSpeed);
       setFoodType(foodType);
       setSpecies(species);
    }

    @Override
    public void eat() {
        System.out.println(species+" "+getName()+" ест "+foodType);
    }

    @Override
    public void move(){
        System.out.println(species+" "+getName()+" передвигается со скоростью "+getMovementSpeed());

    }
    @Override
    public void sleep(){
        System.out.println(species+" "+getName()+" спит в "+getHabitatArea());
    }
    @Override
    public void walk(){
        System.out.println(species+" "+getName()+" гуляет по "+getHabitatArea());

    }
    public void graze(){
        System.out.println(species+" "+getName()+" пасётся в "+getHabitatArea());

    }
    public String getSpecies() {
        return species;
    }

    private void setSpecies(String species) {
        this.species = ValidateUtil.validateString(species);
    }


    public String getFoodType() {
        return foodType;
    }
    private void setFoodType(String foodType) {
        this.foodType = ValidateUtil.validateString(foodType);
    }

    @Override
    public String toString(){
        return species+" по кличке " + getName() + "\n" +
                "Возраст: " + getAge() + "\n" +
                "География обитания: " + getHabitatArea()+ "\n" +
                "Скорость передвижения: "+getMovementSpeed()+" км/ч"+ "\n" +
                "--------------------------------------------------------\n";
    }
}
