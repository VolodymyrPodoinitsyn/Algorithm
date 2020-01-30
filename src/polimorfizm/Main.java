package polimorfizm;

public class Main {

    public static void main(String[] args) {

        Animal cat = new Cat("Vaska");
        Animal dog = new Dog("Barbos");

        cat.voice();
        dog.voice();


    }
}
