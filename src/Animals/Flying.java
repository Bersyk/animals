package Animals;

public class Flying extends Birds{
    private final String movementType;

    public Flying(String name, int age, String livingEnvironment, String movementType) {
        super(name, age, livingEnvironment);
        this.movementType = validOrDefault(movementType, "default");
    }
    @Override
    public void eat() {
        System.out.println(getName() + " кушает в основном мелких насекомых и червяков");
    }
    @Override
    public void go() {
        System.out.println(getName() + " перемещается");
    }
    public String toString() {
        return "Кличка:" + getName() + " Возраст:" + getAge() + " Среда обитания:" + getLivingEnvironment() + " Тип передвижения:" + getMovementType();
    }

    public String getMovementType() {
        return movementType;
    }
    public void fly() {
        System.out.println(getName() + " летает!");
    }
}
