package Animals;

public class Herbivores extends Mammals{

    private final String typeOfFood;

    public Herbivores(String name, int age, String livingEnvironment, int movementSpeed, String typeOfFood) {
        super(name, age, livingEnvironment, movementSpeed);
        this.typeOfFood = validOrDefault(typeOfFood, "default");
    }

    @Override
    public String toString() {
        return "Кличка:" + getName() + " Возраст:" + getAge() + " Среда обитания:" + getLivingEnvironment() + " Скорость передвижения:" + getMovementSpeed() + " Тип пищи:" + getTypeOfFood();
    }

    public void graze() {
        System.out.println(getName() + " пасётся.");
    }
    @Override
    public void eat() {
        System.out.println(getName() + " кушает только растительную пищу и не употребляет мясные продукты.");
    }

    @Override
    public void go() {
        System.out.println(getName() + " перемещается");
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }
}
