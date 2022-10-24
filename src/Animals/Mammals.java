package Animals;

public abstract class Mammals extends Animals {
    private final String livingEnvironment;
    private final int movementSpeed;

    public Mammals(String name, int age, String livingEnvironment, int movementSpeed) {
        super(name, age);
        this.livingEnvironment = validOrDefault(livingEnvironment, "zoo");
        this.movementSpeed = Math.max(age, 0);
    }
    public void walk() {
        System.out.println(getName() + " ПОШел(-ла) гулять");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }
}
