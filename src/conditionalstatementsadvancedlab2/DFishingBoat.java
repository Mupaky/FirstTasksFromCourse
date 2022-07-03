package conditionalstatementsadvancedlab2;

import java.util.Scanner;

public class DFishingBoat {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int budged = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishersAmount = Integer.parseInt(scanner.nextLine());

        int priceForBoat = 0;
        double discount = 0;





        if(budged >= 1 && budged <= 8000 && fishersAmount >= 4 && fishersAmount <= 18
            || (season.equals("Spring") || season.equals("Summer")
                || season.equals("Autumn") || season.equals("Winter"))){
            if("Spring".equals(season)){
                priceForBoat = 3000;
            }else if("Summer".equals(season) || "Autumn".equals(season)){
                priceForBoat = 4200;
            }else if("Winter".equals(season)){
                priceForBoat = 2600;
            }

            double totalBoatPrice;

            if(fishersAmount <= 6){
                discount = 0.1;
            }else if(fishersAmount >= 7 && fishersAmount <= 11){
                discount = 0.15;
            }else {
                discount = 0.25;
            }
            if(fishersAmount % 2 == 0 && !"Autumn".equals(season)){
                discount = discount + 0.05;
            }

            totalBoatPrice = priceForBoat - (priceForBoat * discount);

            if(budged >= totalBoatPrice){
                System.out.printf("Yes! You have %.2f leva left.", budged - totalBoatPrice);
            }else {
                System.out.printf("Not enough money! You need %.2f leva.", totalBoatPrice - budged);
            }
        }
    }
}
