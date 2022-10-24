import Animals.*;

public class Main {
    public static void main(String[] args) {
        Herbivores gazelle = new Herbivores("Газелька", 17, "Зоопарк", 50, "Травоядное");
        Herbivores giraffe = new Herbivores("Жирафик", 20, "Саванна", 40, "Травоядное");
        Herbivores horse = new Herbivores("Лошкадка", 5, "Луга", 50, "Травоядное");
        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);
        gazelle.eat();
        gazelle.go();
        gazelle.graze();
        System.out.println(gazelle.equals(giraffe));
        System.out.println(gazelle.equals(horse));
        System.out.println(giraffe.equals(horse));

        Predators hyena = new Predators("Шакал", 15, "Саванна", 37, "Плотоядное");
        Predators tiger = new Predators("Герцог", 25, "Саванна", 40, "Плотоядное");
        Predators bear = new Predators("Лапа", 17, "Леса", 50, "Плотоядное");
        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(bear);
        hyena.eat();
        hyena.go();
        hyena.hunt();
        System.out.println(hyena.equals(tiger));
        System.out.println(hyena.equals(bear));
        System.out.println(tiger.equals(bear));

        Аmphibians frog = new Аmphibians("Фрогии", 3, "Пресные водоёмы");
        Аmphibians freshwaterSnake = new Аmphibians("Змеюга", 5, "Пресные водоёмы");
        System.out.println(frog);
        System.out.println(freshwaterSnake);
        frog.eat();
        frog.go();
        frog.hunt();
        System.out.println(frog.equals(freshwaterSnake));

        Flightless peacock = new Flightless("Пекок",10, "Тропики", "Ходьба, бег");
        Flightless penguin = new Flightless("Пен-Пен",10, "Ледники", "Ходьба");
        Flightless dodoBird = new Flightless("default",10, "Вымер", "Неизвестно");
        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(dodoBird);
        peacock.go();
        peacock.eat();
        peacock.hunt();
        peacock.walk();
        System.out.println(peacock.equals(penguin));
        System.out.println(peacock.equals(dodoBird));
        System.out.println(dodoBird.equals(penguin));

        Flying seagull = new Flying("Пеликан", 4,"Приморская территория", "Полёт");
        Flying albatross = new Flying("Снежок", 2,"default", "Полёт");
        Flying falcon = new Flying("Зоркий", 6,"Горная местность", "Полёт");
        System.out.println(seagull);
        System.out.println(albatross);
        System.out.println(falcon);
        seagull.fly();
        seagull.eat();
        seagull.go();
        seagull.hunt();
        System.out.println(seagull.equals(albatross));
        System.out.println(seagull.equals(falcon));
        System.out.println(falcon.equals(albatross));
    }
}
