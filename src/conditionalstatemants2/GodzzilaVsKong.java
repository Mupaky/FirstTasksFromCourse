package conditionalstatemants2;

import java.util.Scanner;

public class GodzzilaVsKong {

    public static void main(String[] args) {

        double decor = 0;
        double priceClothesTotal;

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double amountStatists = Double.parseDouble(scanner.nextLine());
        double priceClothes = Double.parseDouble(scanner.nextLine());

        if(budget >= 1 && budget <= 1000000
                && amountStatists >= 1 && amountStatists <= 500
                && priceClothes >= 1 && priceClothes <= 1000){

            decor = budget * 0.1;
            priceClothesTotal = amountStatists * priceClothes;

            if(amountStatists > 150){
                priceClothesTotal = priceClothesTotal - priceClothesTotal * 0.1;
            }
            double sum = decor + priceClothesTotal;

            if(sum > budget){
                System.out.println("Not enough money!");
                System.out.printf("Wingard needs %.2f leva more.", sum - budget);
            }else {
                System.out.println("Action!");
                System.out.printf("Wingard starts filming with %.2f leva left.", budget - sum);
            }

        }


    }
}
