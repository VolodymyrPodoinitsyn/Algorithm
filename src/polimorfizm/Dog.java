package polimorfizm;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("I can speak Gav");
    }
}
