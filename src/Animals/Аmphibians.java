package Animals;

public class Аmphibians extends Animals {
    private final String livingEnvironment;

    public Аmphibians(String name, int age, String livingEnvironment) {
        super(name, age);
        this.livingEnvironment = validOrDefault(livingEnvironment, "zoo");
    }

    public String toString() {
        return "Кличка:" + getName() + " Возраст:" + getAge() + " Среда обитания:" + getLivingEnvironment();
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " хищник, питается в основном мелкими насекомыми");
    }

    public void hunt() {
        System.out.println(getName() + " вышел на охоту...");
    }

    @Override
    public void go() {
        System.out.println(getName() + " перемещается");
    }
}
