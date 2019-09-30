import java.util.Scanner;

public class BelastingSpaargeld {
    public static void main(String[] args){
        Scanner Keyboard = new Scanner(System.in);
        float bedragGeenBelasting = 30846;
        float restantGeld;
        float spaargeld = 0;
        float contantgeld = 0;
        float belegd = 0;
        float heffingsvrij = 400;


        System.out.print("voer spaargeld + belegingen in: ");
        float totaalGeld = Keyboard.nextFloat();

        restantGeld = totaalGeld - bedragGeenBelasting;
        if (restantGeld <= 0){
            System.out.println("U hoeft geen belasting te betalen.");
        }

        else if (restantGeld > 0){
            spaargeld = contantgeld = belegd = restantGeld/3;

            System.out.println("\nSpaargeld is: " + spaargeld);
            System.out.println("Contant is: " + contantgeld);
            System.out.println("Belegd is: " + belegd);

            double rendamentSpaargeld = spaargeld*0.0009;
            double rendamentContant = contantgeld*0.0533;
            double rendamentBelegd = belegd*0.0303;

            System.out.println("\nrendament op Spaargeld is (0.09%): " + rendamentSpaargeld);
            System.out.println("rendament op Contant is (5.33%): " + rendamentContant);
            System.out.println("rendament op Belegd is (3.03%): " + rendamentBelegd);

            double rendamentTotaal = rendamentBelegd + rendamentContant + rendamentSpaargeld;
            double inkomen = rendamentTotaal - heffingsvrij;

            if (inkomen <= 0){
                System.out.println("\nU hoeft geen belasting te betalen.");
            }
            else if (inkomen > 0) {
                double betalenBelasting = inkomen * 0.33;
                System.out.println("\nTe betalen belasting is: " + betalenBelasting);
            }

        }

    }

}
