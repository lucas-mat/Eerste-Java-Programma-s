public class mijnLoopje {
    public static void main(String[] args) {

       /* int leeftijd = 21;
        int teller = 1;


               while (teller < leeftijd) {
                   teller++;
                   System.out.println(teller);
                   */

        String maand = "feb";

        switch (maand) {
            case "sep":
                System.out.println("te klein");
                break;
            case "okt":
            case "nov":
            case "dec":
                System.out.println("Superlekker");
                break;
            case "jan":
            case "feb":
            case "mrt":
            case "apr":
                System.out.println("Kinds seizoen");
                break;
            default:
                System.out.println("Geen Mosselen");

        }
    }
}
