package Animal.Zoo;

public class Cat extends Animal {


    public Cat(String inputName) {
        super(inputName);
    }

    @Override
    public void sound() {
        System.out.println("Miauw");
    }

    public void scratch(){

        int scratch = 3;
    }

}


