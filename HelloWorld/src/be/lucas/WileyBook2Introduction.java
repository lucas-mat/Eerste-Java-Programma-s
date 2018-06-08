package be.lucas;

public class WileyBook2Introduction {

    public static void main(String[] args) {

    double cellCost = 30;
    double addMin   = 0.45;
    double tax = 0.12;
    int min = 700;

        if(0 < min && min > 300){

            min = min - 300;
            double charge = cellCost + ((min * addMin)*0.125);

            System.out.println("Your monthly charge is "+ charge);

        }




    }
}
