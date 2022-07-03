package conditionalstatemants2;

import java.util.Scanner;

public class ToyShop {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double puzzlePrice = 2.6;
        double talkingDollPrice = 3;
        double fluffyBearPrice = 4.1;
        double minionPrice = 8.2;
        double smallTruckPrice = 2;

        double priceVacantion = Double.parseDouble(scanner.nextLine());
        int puzzleAmount = Integer.parseInt(scanner.nextLine());
        int talkingDollAmount = Integer.parseInt(scanner.nextLine());
        int fluffyBearAmount = Integer.parseInt(scanner.nextLine());
        int minionAmount = Integer.parseInt(scanner.nextLine());
        int smallTruckAmount = Integer.parseInt(scanner.nextLine());
        double toysPrice = 0;
        int toysAmount = 0;

        //First validation of amounts
        if(priceVacantion >= 1 && priceVacantion <= 10000
                && puzzleAmount >= 0 && puzzleAmount <= 1000
                && talkingDollAmount >= 0 && talkingDollAmount <= 1000
                && fluffyBearAmount >= 0 && fluffyBearAmount <= 1000
                && minionAmount >= 0 && minionAmount <= 1000
                && smallTruckAmount >= 0 && smallTruckAmount <= 1000){

            toysAmount = puzzleAmount + talkingDollAmount
                    + fluffyBearAmount + minionAmount + smallTruckAmount;
            toysPrice = puzzleAmount * puzzlePrice + talkingDollAmount * talkingDollPrice
                    + fluffyBearAmount * fluffyBearPrice + minionAmount * minionPrice
                    + smallTruckAmount * smallTruckPrice;

            //Check for discount
            if(toysAmount >= 50){
                toysPrice = toysPrice - toysPrice * 0.25;
            }

            toysPrice = toysPrice - toysPrice * 0.1;

            //Check if enough
            if(priceVacantion < toysPrice){
                System.out.printf("Yes! %.2f lv left.", toysPrice - priceVacantion);
            }else{
                System.out.printf("Not enough money! %.2f lv needed.", priceVacantion - toysPrice);
            }
        }
    }
}
