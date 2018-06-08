package be.lucas;

public class IntroducingArrays {

    public static void main(String[] args) {

        //String is an array of characters.

        /*
        int[] = een ander "type";
        int[] i = {1,5,6,8,5};

        int[] j = {1, 2, 5, 6, 9}:

        System.out.println(j.length);

        je kan een array niet groter maken, maar je kan wel indexposities vervangen.
        0 based indexes = (0,1,2,3,4,5,6); -> bv. int getal = j[2] -> 5

        */

        int[] array =  {1,4,5,-6,8};

        //System.out.println(array.length);

        int index = 3;
        int getal = array[index];
        //System.out.println(getal);


        for (int teller = 0; teller < array.length; teller++){

            int e = array[teller];


            System.out.println(e);

        }


        }


    }
