package animals;

public class Amphibians extends Animals{
    private String species;
    private String habitatArea;

    public Amphibians(String species, String name, int age, String habitatArea) {
        super(name, age);
        setSpecies(species);
        setHabitatArea(habitatArea);
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
        System.out.println(species+" "+getName()+" передвигается по  "+getHabitatArea());

    }

    public void hunt(){
        System.out.println(species+" "+getName()+" охотится");

    }
    public String getHabitatArea() {
        return habitatArea;
    }

    private void setHabitatArea(String habitatArea) {
        this.habitatArea = validateUtil.validateString(habitatArea);
    }
    public String getSpecies() {
        return species;
    }

    private void setSpecies(String species) {
        this.species = validateUtil.validateString(species);
    }
    @Override
    public String toString(){
        return species+" по кличке " + getName() + "\n" +
                "Возраст: " + getAge() + "\n" +
                "География обитания: " + getHabitatArea()+ "\n" +
                "--------------------------------------------------------\n";
    }
}

