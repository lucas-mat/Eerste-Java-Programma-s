package Animal.Zoo;

public class AnimalZoo {

    public static void main(String[] args) {

        Animal catto = new Cat("Moosh");
        Animal birdo = new Bird("Flip");
        Animal doggo = new Dog("Becky");


        catto.sound();
        birdo.sound();
        doggo.sound();

        System.out.println(((Cat) catto).scratchPower());
        System.out.println("Bird flies "+((Bird) birdo).fly()+" meters high.");


    }

}
