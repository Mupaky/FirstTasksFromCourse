package firstexercise;

import java.util.Scanner;

public class FoodDelivery {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double menuChicken = 10.35;
        double menuFish = 12.40;
        double menuVegan = 8.15;
        double delivery = 2.5;

        int menuChickenAmount = Integer.parseInt(scanner.nextLine());
        int menuFishAmount = Integer.parseInt(scanner.nextLine());
        int menuVeganAmount = Integer.parseInt(scanner.nextLine());

        if(menuChickenAmount >= 1 && menuChickenAmount <= 100
                && menuFishAmount >= 1 && menuFishAmount <= 100
                && menuVeganAmount >= 1 && menuVeganAmount <= 100){
                double menuChickenTotal = menuChicken * menuChickenAmount;
                double menuFishTotal = menuFish * menuFishAmount;
                double menuVeganTotal = menuVegan * menuVeganAmount;
                double sum = menuChickenTotal + menuFishTotal + menuVeganTotal;
                double desertPrice = sum * 0.2;
                System.out.println(sum + desertPrice + 2.5);
        }

    }
}
