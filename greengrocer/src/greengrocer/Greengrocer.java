package greengrocer;

import java.util.Scanner;

public class Greengrocer {

    public static void main(String[] args) {

        double Pear = 2.14;
        double Apple = 3.67;
        double Tomatoes = 1.11;
        double Banana = 0.95;
        double Eggplant = 5.00;

        Scanner scan = new Scanner(System.in);

        System.out.print("how many kilograms pears: ");
        int pearkg = scan.nextInt();
        System.out.print("how many kilograms apples: ");
        int applekg = scan.nextInt();
        System.out.print("how many kilograms tomatoes: ");
        int tomatoeskg = scan.nextInt();
        System.out.print("how many kilograms bananas: ");
        int bananaskg = scan.nextInt();
        System.out.print("how many kilograms eggplants: ");
        int eggplantskg = scan.nextInt();

        double price = Pear * pearkg + applekg * Apple + tomatoeskg * Tomatoes + bananaskg * Banana + eggplantskg * Eggplant;
        System.out.printf("your price is:%f TL", price);
    }

}
