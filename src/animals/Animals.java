package animals;

public abstract class Animals {
    private String name;
    private int age;

//    ValidateUtil validateUtil = new ValidateUtil();

    public Animals(String name, int age) {
        setName(name);
        setAge(age);
    }

    public abstract void eat();
    public abstract void sleep();
    public abstract void move();

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = ValidateUtil.validateString(name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = ValidateUtil.validateInt(age);
    }
}
