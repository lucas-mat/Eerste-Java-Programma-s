package Animal.Zoo;

import java.util.Random;

public class Cat extends Animal {


    public Cat(String inputName) {
        super(inputName);
    }

    //@Override
    public void sound() {
        System.out.println("Miauw");



    }

    public int scratchPower(){

        
        int scratch = 3;

        return scratch;
    }

}


