package Animals;

public class Predators extends Mammals{
    public final String typeOfFood;

    public Predators(String name, int age, String livingEnvironment, int movementSpeed, String typeOfFood) {
        super(name, age, livingEnvironment, movementSpeed);
        this.typeOfFood = validOrDefault(typeOfFood, "default");
    }

    public String toString() {
        return "Кличка:" + getName() + " Возраст:" + getAge() + " Среда обитания:" + getLivingEnvironment() + " Скорость передвижения:" + getMovementSpeed() + " Тип пищи:" + getTypeOfFood();
    }
    @Override
    public void eat() {
        System.out.println(getName() + " охотится на других и кушает мясную пищу");
    }

    @Override
    public void go() {
        System.out.println(getName() + " перемещается");
    }

    public void hunt() {
        System.out.println(getName() + " вышел на охоту...");
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }
}
