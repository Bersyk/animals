package Animals;

public abstract class Birds  extends Animals{
    private final String livingEnvironment;

    public Birds(String name, int age, String livingEnvironment) {
        super(name, age);
        this.livingEnvironment = validOrDefault(livingEnvironment, "zoo");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void hunt() {
        System.out.println(getName() + " вышел на охоту...");
    }
}
