package Animal.Zoo;

public class Bird extends Animal {

    public Bird(String inputName) {
        super(inputName);
    }

    public int fly(){

        int flyingHeight = 2;
        return flyingHeight;

    }
    public void sound(){
        System.out.println("Chipchip");
    }

}
