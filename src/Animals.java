public abstract class Animals {
    private String name;
    private int age;

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static String validOrDefault(String value, String defaultValue) {
        if (value == null || value.isBlank()) {
            return defaultValue;
        }
        return value;
    }

    public abstract void eat();
    public abstract void go();
    public void sleep() {
        System.out.println("Животное " + getName() + " спит.");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = validOrDefault(name, "Animals");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = Math.max(age, 0);
    }
}
