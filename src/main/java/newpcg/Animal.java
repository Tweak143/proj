package newpcg;

public abstract class Animal implements IAnimal, IInt {

    private String name;
    public int age;

    public abstract void move();

    protected String getName(String name) {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }
}
