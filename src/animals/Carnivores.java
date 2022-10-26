package animals;

public class Carnivores extends Mammals{

    private final String species;
    public String foodType;

    public Carnivores(String species, String name, int age, String habitatArea, int movementSpeed, String foodType){
        super(name,age,habitatArea, movementSpeed);
        this.species = ValidateUtil.validateString(species);
        this.foodType = ValidateUtil.validateString(foodType);
    }
    @Override
    public void eat(){
        System.out.println(species+" "+getName()+" ест "+foodType);

    }
    @Override
    public void sleep(){
        System.out.println(species+" "+getName()+" спит в "+getHabitatArea());
    }
    @Override
    public void move(){
        System.out.println(species+" "+getName()+" передвигается со скоростью "+getMovementSpeed());
    }
    @Override
    public void walk(){
        System.out.println(species+" "+getName()+" гуляет по "+getHabitatArea());

    }
    public void hunt(){
        System.out.println(species+" "+getName()+" охотится в "+getHabitatArea());

    }

    public String getSpecies() {
        return species;
    }

    public String getFoodType() {
        return foodType;
    }

    @Override
    public String toString(){
        return
                species+" по кличке " + getName() + "\n" +
                "Возраст: " + getAge() + "\n" +
                "География обитания: " + getHabitatArea()+ "\n" +
                "Скорость передвижения: "+getMovementSpeed()+" км/ч"+ "\n" +
                "--------------------------------------------------------\n";
    }
}
