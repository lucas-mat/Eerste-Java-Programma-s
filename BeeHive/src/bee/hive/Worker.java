package bee.hive;

import java.util.*;

public class  Worker extends Bij {




    int n = 1;
    int capacity = 50;

    Random rand = new Random();



    public int gatherNectar() {

         n = n * rand.nextInt(6);

        int nectar = 0;


            if(nectar <= capacity){

                nectar = nectar + n;







        }



        // nectar = nectar - 50;


        return nectar;
    }
    }




/*



    public void repairHive(){


        for(int i=1; i <= 10 ; i++){}

          //  if(HiveDamage != 100){}
          //Capacity & load

          //public void main gatherNectar()(

*/









