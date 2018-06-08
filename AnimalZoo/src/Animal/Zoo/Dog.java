package Animal.Zoo;

public class Dog extends Animal {

    public Dog(String inputName) {
        super(inputName);
    }
    @Override
    public void sound() {
        System.out.println("Woof");
    }

}
