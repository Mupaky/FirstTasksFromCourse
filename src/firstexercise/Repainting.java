package firstexercise;

import java.util.Scanner;

public class Repainting {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double protectivePlasticPrice = 1.50;
        double paintPrice = 14.50;
        double paintLiquidPrice = 5.00;
        double bagPrice = 0.40;

        int plasticAmount = Integer.parseInt(scanner.nextLine());
        int paintAmount = Integer.parseInt(scanner.nextLine());
        int paintLiquidAmount = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        if(plasticAmount >= 1 && plasticAmount <= 100
                && paintAmount >= 1 && paintAmount <= 100
                && paintLiquidAmount >= 1 && paintLiquidAmount <= 30
                && hours >= 1 && hours <= 9){
            double protectivePlasticTotal = (plasticAmount + 2) * protectivePlasticPrice;
            double paintTotal = (paintAmount + paintAmount * 0.1) * paintPrice;
            double paintLiquidTotal = paintLiquidAmount * paintLiquidPrice;
            double materialsTotal = protectivePlasticTotal + paintTotal + paintLiquidTotal + bagPrice;
            double hoursPrice = materialsTotal * 0.3;

            System.out.println(" Plas " + protectivePlasticTotal);
            System.out.println(" paint " + paintTotal);
            System.out.println(" paintliquid " + paintLiquidTotal);
            System.out.println(" Hours " + hoursPrice);

            System.out.println(" Total " + hours*hoursPrice);

        }
    }
}
