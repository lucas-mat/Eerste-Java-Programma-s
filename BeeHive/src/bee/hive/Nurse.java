package bee.hive;

import static java.lang.Math.round;

public class Nurse extends Bij {


    //nectar => transormToHoney
    //nectar => transformToBlocks

    Worker nectarSlave = new Worker();

        int maxHoney = 0;

    public int makeHoney() {

        int nectarPlus =  nectarSlave.gatherNectar();


            while(maxHoney<1000) {


                maxHoney = nectarPlus + maxHoney;



            }


        return maxHoney;

        //Als de load van de bij vol is brengt hij het naar de nurse
        //feeds Larvae with honey => amount of honey decreases with the amount of Larvae (clock?)
        //if larvae doesnt get honey => Larvae dies.


    }
}

