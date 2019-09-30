import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Helloworld {
    public static void main(String[] args){

        System.out.println("je bent zelf laatste!");
        Extra extra = new Extra();
        System.out.println("gime gime");


        //dag 1
        //letterChecker();
        //abccba();
        //dag 2
        //deTafelVan();
        //binair();
        //maandSelect();
        //faculteid();
        //arayCijfers();
        //arayIncompleet();
        //arayControleren();
        //arayCopieren();
        //arayReverse();
        //arayTabelPlusSom();
        //arayTabelSchuin();
        //araySpiegelbeeld();
        //arayVolgordeSorteren();
        //overeenkomstGetallen();
        //arayCijferCecken();

    }

    public static void letterChecker(){
        System.out.println("letter checker");
        Scanner Keyboard = new Scanner(System.in);
        String leter = "aieou";
        int count = 0;

        String zin = Keyboard.next();
        for (int i = 0; i < zin.length(); i++) {
            for (int j = 0; j < leter.length(); j++) {
                System.out.println("Hallo!");
                if (zin.toLowerCase().charAt(i) == leter.charAt(j))
                    count++;
            }

        }
        System.out.println(count);
    }

    public static void abccba(){
        System.out.println("abc cba");
        String abc = "ABCDE";
        String outputString = "";

        int stringLengt = abc.length();

        for (int i = stringLengt -1; i >= 0; i--){
            outputString += abc.charAt(i);
        }

        System.out.println(outputString);

    }

    public static void deTafelVan(){
        Scanner Keyboard = new Scanner(System.in);
        System.out.print("getal: ");
        int getal = Keyboard.nextInt();
        System.out.print("lengte: ");
        int lengte = Keyboard.nextInt();
        int i = 1;

        while (i<=lengte){
            System.out.printf("%d*%d = %d\n",getal, i, getal*i);
            i++;
        }
    }

    public static void binair(){
        Scanner Keyboard = new Scanner(System.in);

        long b1, b2;
        int i = 0, carry = 0;
        //This is to hold the output binary number
        int[] sum = new int[10];

        System.out.print("Enter first binary number: ");
        b1 = Keyboard.nextLong();
        System.out.print("Enter second binary number: ");
        b2 = Keyboard.nextLong();
        Keyboard.close();

        while (b1 != 0 || b2 != 0) {
            sum[i++] = (int)((b1 % 10 + b2 % 10 + carry) % 2);
            carry = (int)((b1 % 10 + b2 % 10 + carry) / 2);
            b1 = b1 / 10;
            b2 = b2 / 10;
        }
        if (carry != 0) {
            sum[i++] = carry;
        }
        --i;
        System.out.print("Output: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.print("\n");

    }

    public static void maandSelect() {
        Scanner Keyboard = new Scanner(System.in);

        System.out.print("voer nummer maand in: ");
        int maandNummer = Keyboard.nextInt();
        System.out.print("het opgegeven maand nummer komt overeen met ");
        switch (maandNummer){
            case 1:
                System.out.println("januari");
                break;
            case 2:
                System.out.println("februari");
                break;
            case 3:
                System.out.println("maart");
                break;
            case 4:
                System.out.println("april");
                break;
            case 5:
                System.out.println("mei");
                break;
            case 6:
                System.out.println("juni");
                break;
            case 7:
                System.out.println("juli");
                break;
            case 8:
                System.out.println("augustus");
                break;
            case 9:
                System.out.println("september");
                break;
            case 10:
                System.out.println("oktober");
                break;
            case 11:
                System.out.println("november");
                break;
            case 12:
                System.out.println("december");
                break;
            default:
                System.out.println("geen enkele maand");
        }

    }

    public static void faculteid(){
        Scanner Keyboard = new Scanner(System.in);
        int antwoord = 0;
        int tijdelijk = 0;

        System.out.print("voer nummer in: ");
        int faculteid = Keyboard.nextInt();
        int i = 1;

        while (i <= faculteid-1){
            tijdelijk = i;
            i++;
            if(antwoord == 0) {
                antwoord = tijdelijk*i;
            }
            else {
                antwoord = antwoord*i;
            }

        }
        System.out.println("antwoord is: "+ antwoord);


    }

    public static void arayCijfers(){

        int sum = 0;

        int cijfers[] = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i<cijfers.length; i++){
            sum += cijfers[i];
        }
        System.out.println(sum);

    }

    public static void arayIncompleet(){

        int incompleetArray[];
        incompleetArray = new int[10];

        for (int i = 0; i<3; i++){
            incompleetArray[i] = i+1;
        }

        for (int i = 3; i<incompleetArray.length; i++){
            incompleetArray[i] = i+1;
        }

        for (int value : incompleetArray) {
            System.out.print(value+" ");
        }
        System.out.println("\n" + Arrays.toString(incompleetArray));

    }

    public static void arayControleren(){

        boolean jaNee = false;
        int controleGetal = 3;
        int[] cijfers = {1,2,3,4,5,6,7,8,9,10};


        for (int cijfer : cijfers) {
            if (cijfer == controleGetal) {
                jaNee = true;
                break;
            }
        }
        System.out.println(jaNee);
    }

    public static void arayCopieren(){
        int[] cijfers = {1,2,3,4,5,6,7,8,9,10};

        int[] incompleetArray;
        incompleetArray = new int[10];

        System.out.println(Arrays.toString(incompleetArray)+" lege lijst");

        for (int i = 0; i<cijfers.length; i++){
            incompleetArray[i] = cijfers[i];
        }

        System.out.println(Arrays.toString(cijfers)+" OG lijst");
        System.out.println(Arrays.toString(incompleetArray)+" lege lijst");

    }

    public static void arayReverse(){
        Random r = new Random();
        int randomGetal = r.nextInt(50);
        System.out.println(randomGetal);

        int[] cijfers;
        cijfers = new int[randomGetal];

        for (int i = 0; i<cijfers.length; i++){
            int randomGetal2 = r.nextInt(50);
            cijfers[i] = randomGetal2;
        }

        int[] incompleetArray;
        incompleetArray = new int[cijfers.length];
//        int j = incompleetArray.length-1;

        for (int i = 0; i<cijfers.length; i++){
            //incompleetArray.length-1-i of j
            incompleetArray[i] = cijfers[incompleetArray.length-1-i];
//            j--;
        }

        System.out.println(Arrays.toString(cijfers));
        System.out.print(Arrays.toString(incompleetArray));

    }

    public static void arayTabelPlusSom(){

        int[][] incompleetArray = {{1,2,3}, {4,5,6}, {7,8,9}};
        int som = 0;

        for(int i =0; i<3; i++){
            for (int j =0; j<3; j++){
                System.out.print(incompleetArray[i][j]+ " ");
                som += incompleetArray[i][j];
            }
            System.out.print("\n");
        }
        System.out.println("\n"+som);
    }

    public static void arayTabelSchuin(){
        int[][] incompleetArray = {{1,2,3}, {4,5,6}, {7,8,9}};

        for(int i =0; i<3; i++){
            for (int j =0; j<3; j++){
                System.out.print(incompleetArray[i][j]+ " ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for(int i =0; i<3; i++) {
            for (int j = 0; j<3; j++) {
                if (i == j) {
                    System.out.print(incompleetArray[i][j]);
                    System.out.print(" ");
                }
            }
        }
    }

    public static void araySpiegelbeeld(){

        int[][] incompleetArray = {{1,2,3}, {4,5,6}, {7,8,9},};
        int[][] arrayGespiegeld;
        arrayGespiegeld = new int[3][3];

        for(int i =0; i<incompleetArray.length; i++){
            for (int j =0; j<incompleetArray[i].length; j++){
                System.out.print(incompleetArray[i][j]+ " ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");


        for(int i=0; i<incompleetArray.length; i++) {
            for (int j=0; j<incompleetArray[i].length; j++) {
                arrayGespiegeld[i][j] = incompleetArray[arrayGespiegeld.length-1-i][arrayGespiegeld[i].length-1-j];
                System.out.print(arrayGespiegeld[i][j]+ " ");
                // or
//                System.out.print(incompleetArray[arrayGespiegeld.length-1-i][arrayGespiegeld[i].length-1-j]+" ");
            }
            System.out.print("\n");
        }
    }

    public static void arayVolgordeSorteren(){
        Random r = new Random();
        int randomGetal = r.nextInt(20);
        System.out.println(randomGetal);

        int[] cijfers;
        cijfers = new int[randomGetal];

        for (int i = 0; i<cijfers.length; i++){
            int randomGetal2 = r.nextInt(50);
            cijfers[i] = randomGetal2;
        }

        int[] arayGesorteerd;
        arayGesorteerd = new int[cijfers.length];
        int j = 0;
        int tempLaagste = cijfers[0];

        for (int i = 0; i<cijfers.length-1; i++){
            if (cijfers[i+1]<cijfers[i]){
                arayGesorteerd[j] = cijfers[i+1];
                tempLaagste = cijfers[i+1];
                if (tempLaagste<cijfers[i]) {
                    for (int k = 0; k < cijfers.length - 1; k++) {
                        if (arayGesorteerd[j] < cijfers[k]) {
                            arayGesorteerd[j] = cijfers[i];
                        }
                    }
                }

            }
            j++;
        }
        System.out.println(Arrays.toString(arayGesorteerd));

//        if (tempLaagste<cijfers[i]) {
//            arayGesorteerd[j] = cijfers[i];
//            j++;
//        }

    }

    public static void overeenkomstGetallen(){
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("eerste getal");
        int getal = Keyboard.nextInt();
        int getal2 = Keyboard.nextInt();
        String textGetal = Integer.toString(getal);
        String textGetal2 = Integer.toString(getal2);
        int lengtGetal = textGetal.length();
        int lengtGetal2 = textGetal2.length();


        if (getal > 25 && getal < 75 && getal2 >25 && getal2<75){
            System.out.println("de getallen zitten tussen 25 en 75");
            for (int i =0; i < lengtGetal; i++){
                for (int j =0; j < lengtGetal2; j++){
                    if (textGetal.charAt(i) == textGetal2.charAt(j)){
                        System.out.println("de getallen hebben een getal met elkaar gemeen");
                        System.exit(0);
                    }
                }
            }
        }


    }

    public static void arayCijferCecken(){
        Random r = new Random();
        int lengte = r.nextInt(10);
        System.out.println(lengte);

        int[] cijfers;
        cijfers = new int[lengte];

        for (int i = 0; i<cijfers.length; i++){
            int randomGetal2 = r.nextInt(11);
            cijfers[i] = randomGetal2;
        }
        System.out.println(Arrays.toString(cijfers));

        if (lengte < 2){
            System.out.println("false. Lengte is te kort");
            System.exit(0);
        }
        else if (cijfers[0]==10 || cijfers[lengte-1]==10){
            System.out.println("true");
        }
        else {
            System.out.println("false. geen 10 aan het begin of eind");
        }


    }

}
