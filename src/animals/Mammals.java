package animals;

public abstract class Mammals extends Animals{
    private String habitatArea;
    private int movementSpeed;

    public Mammals(String name, int age, String habitatArea, int movementSpeed) {
        super(name, age);
        setHabitatArea(habitatArea);
        setMovementSpeed(movementSpeed);
    }


    public abstract void walk();

    public String getHabitatArea() {
        return habitatArea;
    }

    private void setHabitatArea(String habitatArea) {
        this.habitatArea = validateUtil.validateString(habitatArea);
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    private void setMovementSpeed(int movementSpeed) {
        this.movementSpeed = validateUtil.validateInt(movementSpeed);
    }
}
