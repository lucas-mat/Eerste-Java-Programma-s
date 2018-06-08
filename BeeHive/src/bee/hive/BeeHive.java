package bee.hive;

import java.util.*;

public class BeeHive {
    public static void main(String[] args) {



        Random rand = new Random();

        Worker worker = new Worker();
        Nurse nurse = new Nurse();
        Soldier arnold = new Soldier();
        Soldier silvy = new Soldier();
        Queen queen = new Queen();
        Larva larf = new Larva();

        Bij s = new Worker();
        s.fly();




        worker = (Worker)s;



        if(nurse.makeHoney() <= 1000){


                   int mark = worker.gatherNectar() - 50;
            int  joy = nurse.makeHoney() +  50;


        }else{



        }



        System.out.println( "Nectar gathered: " + worker.gatherNectar());
        worker.fly();
        arnold.fly();
        silvy.fly();
        nurse.fly();
        queen.fly();
        larf.fly();


        System.out.println("Honey made from the nectar : " + nurse.makeHoney());



        Bij maja = new Bij ();

        System.out.println(maja);


    }
}
