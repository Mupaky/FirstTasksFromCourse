package firststepsincoding;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float dogFood = 2.5F;
        float catFood = 4;
        int dogFoodPackages = Integer.parseInt(scanner.nextLine());
        int catFoodPackages = Integer.parseInt(scanner.nextLine());

        float price = 0;
        if(dogFoodPackages >= 0 && dogFoodPackages <= 100){
            price = dogFood * dogFoodPackages;
        }else{
            System.out.println("Wrong amount of dog packages.");
        }
        if(catFoodPackages >= 0 && catFoodPackages <= 100){
            price = price + catFood * catFoodPackages;

        }else{
            System.out.println("Wrong amount of cat packages.");
        }
        System.out.printf("%f lv.", price);
    }
}
