import java.util.Scanner;

public class bricks {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        System.out.print("enter gap(in cm): ");
        int gap = Keyboard.nextInt();
        System.out.print("Amount large bricks(5cm): ");
        int lBrickAmount = Keyboard.nextInt();
        System.out.print("Amount small bricks(1cm): ");
        int sBrickAmount = Keyboard.nextInt();


        int lBrick = 5;
        int sBrick = 1;
        int sBrickNeeded = 0;
        boolean past = false;

        int lBrickNeeded = gap/lBrick;
        int smallGapSBrickNeeded = gap-lBrick*lBrickAmount;

        if (lBrickNeeded <= lBrickAmount){
            sBrickNeeded = gap%lBrick;
            if (sBrickNeeded <= sBrickAmount){
                past = true;
                System.exit(0);
            }
            else {
                past = false;
            }
        }
        else if (smallGapSBrickNeeded <= sBrickAmount){
            past = true;
        }
        else {
            past = false;


        }

        if (past == true){
            System.out.println("je kan het gat vullen");
        }
        else {
            System.out.println("je kan het gat niet vullen");
        }



    }



}
