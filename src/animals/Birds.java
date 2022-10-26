package animals;

public abstract class Birds extends Animals{
    private String habitatArea;
    public Birds(String name, int age, String habitatArea){
        super(name,age);
        setHabitatArea(habitatArea);
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void move() {

    }
    public abstract void hunt();
    public String getHabitatArea() {
        return habitatArea;
    }

    private void setHabitatArea(String habitatArea) {
        this.habitatArea = ValidateUtil.validateString(habitatArea);
    }
}
