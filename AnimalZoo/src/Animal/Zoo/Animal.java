package Animal.Zoo;

public abstract class Animal {
    private String name;

    public Animal(String inputName) {
        this.name = inputName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void sound();
}



