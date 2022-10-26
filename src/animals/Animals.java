package animals;

public abstract class Animals {
    private final String name;
    private final int age;


    public Animals(String name, int age) {
        this.name = ValidateUtil.validateString(name);
        this.age = ValidateUtil.validateInt(age);
    }

    public abstract void eat();
    public abstract void sleep();
    public abstract void move();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
