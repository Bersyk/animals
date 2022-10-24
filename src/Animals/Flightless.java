package Animals;

public class Flightless extends Birds {
    private final String movementType;

    public Flightless(String name, int age, String livingEnvironment, String movementType) {
        super(name, age, livingEnvironment);
        this.movementType = validOrDefault(movementType, "default");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " кушает в основном мелких насекомых и червяков");
    }

    public void walk() {
        System.out.println(getName() + " ПОШел(-ла) гулять");
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
}

