package be.beehive;

public class BeeHive {
    public static void main(String[] args) {


        Worker maja = new Worker();

        Soldier arnold = new Soldier();
        Soldier silvy = new Soldier();

        arnold.valAan(silvy);

        System.out.println(arnold.hitpoints +"  "+silvy.hitpoints  );




    }
}
